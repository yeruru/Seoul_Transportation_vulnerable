package com.seoul.guide.subway.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.subway.DTO.MovementDTO;
import com.seoul.guide.subway.DTO.SubwayDTO;
import com.seoul.guide.subway.Service.MovementApiService;
import com.seoul.guide.subway.Service.SubwayService;;

@Controller
public class SubwayController {

	@Autowired
	private SubwayService subwayService;
	
	
	@Autowired
	private MovementApiService movementApiService;
	
	@RequestMapping(value = "/subway", method = RequestMethod.GET) 
	public String subway() {
		return "subway/subway";
	}

	// 검색기능 역명으로 검색하기
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView searchSubway(@RequestParam("STIN_NM") String name) {
		ModelAndView mav = new ModelAndView();
		try {
			List<SubwayDTO> result = subwayService.searchSubwayByName(name);
			mav.addObject("STIN_NM", name);
			mav.addObject("station", result);
			mav.setViewName("subway/subway");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("검색오류");
			mav.setViewName("subway/subway");
		}
		return mav;
	}

	// 지하철오픈api 사용
	@RequestMapping(value = "/subwaydetail", method = RequestMethod.GET)
	public ModelAndView moveApi(@RequestParam(value="station") String station, @RequestParam(value="line") String line) {
		ModelAndView mav = new ModelAndView();
		 try {
			 	List<MovementDTO> move = movementApiService.getMovementList(station, line);
			 	mav.addObject("station",station);
			 	mav.addObject("move", move);
	            System.out.println("출입구성공");
	            mav.setViewName("subway/subwayDetail");
	        } catch (Exception e) {
	            e.printStackTrace();
	            mav.addObject("error", "API 호출에 실패했습니다.");
	            mav.setViewName("subway/subwayDetail");
	        }

	        return mav;
	}
	

}
