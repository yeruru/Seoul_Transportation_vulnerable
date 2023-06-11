package com.seoul.guide.bookmark.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.bookmark.DTO.bookmarkDTO;
import com.seoul.guide.bookmark.Service.bookmarkService;

@Controller
public class bookmarkController {
	@Autowired
	private bookmarkService bookmarkservice;

	@Autowired
	private HttpSession session;

	@RequestMapping(value = "insertbookmark", method = RequestMethod.POST)
	public ModelAndView insertbookmark(@RequestParam("touristId") Integer touristID, bookmarkDTO bookmarkdto) throws Exception {
		ModelAndView mav = new ModelAndView();
		Integer userId = (Integer) session.getAttribute("id");
		bookmarkdto.setUserId(userId);
		bookmarkdto.setTouristId(touristID);
		bookmarkservice.insertbookmark(bookmarkdto);
		mav.setViewName("redirect:detail?id=" + touristID);
		return mav;
	}
	
	@RequestMapping(value="deletebookmark", method=RequestMethod.POST)
	public ModelAndView deletebookmark(@RequestParam("touristId") Integer touristID, bookmarkDTO bookmarkdto) throws Exception {
		ModelAndView mav = new ModelAndView();
		Integer userId = (Integer) session.getAttribute("id");
		bookmarkdto.setUserId(userId);
		bookmarkdto.setTouristId(touristID);
		bookmarkservice.deletebookmark(bookmarkdto);
		mav.setViewName("redirect:detail?id=" + touristID);
		return mav;
	}
	
}
