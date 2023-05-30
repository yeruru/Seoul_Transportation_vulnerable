package com.seoul.guide.subway.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.subway.DTO.SubwayDTO;
import com.seoul.guide.subway.Service.SubwayService;

@Controller
public class SubwayController {
	
	@Autowired
	private SubwayService subwayService;
	
	@RequestMapping(value = "/subway", method={RequestMethod.GET, RequestMethod.POST})
	public String subway() {
		
		return "subway/subway";
	}
	
	//검색기능 역명으로 검색하기
	@RequestMapping(value = "/search", method=RequestMethod.POST )
	public ModelAndView searchSubway(@RequestParam("sub_name") String name) {
		ModelAndView mav = new ModelAndView();
		try {
			List<SubwayDTO> result = subwayService.searchSubway(name);
			mav.addObject("station", result);
			mav.setViewName("subway/subway");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("검색오류");
			mav.setViewName("subway");
		}
		return mav;
	}
	//초기화시 subway로 돌아감
	
	
}
