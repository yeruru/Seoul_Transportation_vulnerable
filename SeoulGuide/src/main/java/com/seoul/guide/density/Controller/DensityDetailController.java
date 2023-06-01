package com.seoul.guide.density.Controller;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.seoul.guide.density.DTO.CityDataResponse;

@Controller
public class DensityDetailController {

	@RequestMapping("/densityDetail")
	public String getDensityDetail(@RequestParam("dens_name") String densName, Model model) {

	    // RestTemplate 생성
	    RestTemplate restTemplate = new RestTemplate();

	    // API URL 생성
	    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://openapi.seoul.go.kr:8088/676c5a574e67636837346f4a627464/xml/citydata/1/5/")
	            .path(densName);

	    // API 호출 및 원시 XML 응답 받기
	    ResponseEntity<String> responseEntity = restTemplate.exchange(builder.build().toUri(), HttpMethod.GET, null, String.class);

	    // 응답 상태 확인
	    HttpStatus statusCode = responseEntity.getStatusCode();
	    if (statusCode == HttpStatus.OK) {
	        // 원시 XML 응답을 로그에 출력
	        String xmlResponse = responseEntity.getBody();
//	        System.out.println("Raw XML response: " + xmlResponse);

	        // 원시 XML 응답을 CityDataResponse 객체로 변환
	        try {
	            JAXBContext jaxbContext = JAXBContext.newInstance(CityDataResponse.class);
	            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	            StringReader reader = new StringReader(xmlResponse);
	            CityDataResponse cityDataResponse = (CityDataResponse) jaxbUnmarshaller.unmarshal(reader);

	            // 변환된 객체를 모델에 추가
	            model.addAttribute("cityDataResponse", cityDataResponse);


	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }
	    }

	    return "density/densityDetail";
	}

}
