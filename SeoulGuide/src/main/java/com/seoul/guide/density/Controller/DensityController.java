package com.seoul.guide.density.Controller;

import java.io.StringReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.seoul.guide.density.DTO.CityDataResponse;
import com.seoul.guide.density.DTO.DensityDTO;
import com.seoul.guide.density.Service.DensityService;

//DensityController
@Controller
public class DensityController {
	@Autowired
	DensityService densityService;

	private ExecutorService executorService = Executors.newFixedThreadPool(100);

	@RequestMapping("/density")
	public String getDensityInfo(Model model, @RequestParam(value = "sort", defaultValue = "default") String sort) throws Exception {
	    List<DensityDTO> densityList;
	    if ("dense_lvl".equals(sort)) {
	        densityList = densityService.selectAllDensityOrderByDenseLvl();
	    } else if ("name".equals(sort)) {
	        densityList = densityService.selectAllDensityOrderByName();
	    } else {
	        densityList = densityService.selectAllDensity();
	    }
	    model.addAttribute("densityList", densityList);
	    model.addAttribute("sort", sort); // 현재 선택된 정렬 옵션을 모델에 추가
	    return "density/density";
	}


    @Scheduled(fixedRate = 600000) // 10분마다 실행
    public void updateData() throws Exception {
    	
    	// 현재 시간
        LocalTime now = LocalTime.now();
        
    	System.out.println("업데이트 완료! DB갱신 " + now);
        List<DensityDTO> densityList = densityService.selectAllDensity();

        List<CompletableFuture<Void>> futureList = new ArrayList<>();

        for(DensityDTO densityDTO : densityList){
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                RestTemplate restTemplate = new RestTemplate();
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://openapi.seoul.go.kr:8088/676c5a574e67636837346f4a627464/xml/citydata/1/5/")
                        .path(densityDTO.getDens_name());

                ResponseEntity<String> responseEntity = restTemplate.exchange(builder.build().toUri(), HttpMethod.GET, null, String.class);
                HttpStatus statusCode = responseEntity.getStatusCode();
                if (statusCode == HttpStatus.OK) {
                    String xmlResponse = responseEntity.getBody();
                    try {
                        JAXBContext jaxbContext = JAXBContext.newInstance(CityDataResponse.class);
                        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                        StringReader reader = new StringReader(xmlResponse);
                        
                        CityDataResponse cityDataResponse = (CityDataResponse) jaxbUnmarshaller.unmarshal(reader);

                        if (cityDataResponse != null && cityDataResponse.getCityData() != null) {
                            try {
                                densityDTO.setDense_lvl(cityDataResponse.getCityData().getOuterLivePopulationStatus().getInnerLivePopulationStatus().getAreaCongestLevel());
                                densityDTO.setDense_msg(cityDataResponse.getCityData().getOuterLivePopulationStatus().getInnerLivePopulationStatus().getAreaCongestMessage());
                                densityService.updateDensity(densityDTO); // DB에 업데이트
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        
                    } catch (JAXBException e) {
                        e.printStackTrace();
                    }
                }
            }, executorService);
            futureList.add(future);
        }

        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
    }
}
