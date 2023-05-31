package com.seoul.guide.tour.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.tour.Service.TourService;

@Controller
public class TourController {
		
	@Autowired
	private TourService tourservice;
	
	@RequestMapping(value = "tourlist", method = RequestMethod.GET)
	public ModelAndView tour() {
		ModelAndView mav = new ModelAndView();		
		try {
			mav.addObject("tourlist", tourservice.gettourList());
			mav.setViewName("tour/tour");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
}
