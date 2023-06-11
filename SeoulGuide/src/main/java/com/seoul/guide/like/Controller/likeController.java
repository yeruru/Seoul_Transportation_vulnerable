package com.seoul.guide.like.Controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.like.DTO.likeDTO;
import com.seoul.guide.like.Service.likeService;

@Controller
public class likeController {
	@Autowired
	private HttpSession session;
	
	@Autowired
	private likeService likeservice;
	
	@RequestMapping(value = "insertlike", method = RequestMethod.POST)
	public ModelAndView insertbookmark(@RequestParam("touristId") Integer touristID, likeDTO likedto, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		Integer userId = (Integer) session.getAttribute("id");
		likedto.setUserId(userId);
		likedto.setTouristId(touristID);
		likeservice.insertlike(likedto);
		mav.setViewName("redirect:detail?id=" + touristID);
		mav.addObject("reloadScript", "<script>window.location.reload();</script>");
		return mav;
	}
	
	@RequestMapping(value="deletelike", method=RequestMethod.POST)
	public ModelAndView deletebookmark(@RequestParam("touristId") Integer touristID, likeDTO likedto) throws Exception {
		ModelAndView mav = new ModelAndView();
		Integer userId = (Integer) session.getAttribute("id");
		likedto.setUserId(userId);
		likedto.setTouristId(touristID);
		likeservice.deletelike(likedto);
		mav.setViewName("redirect:detail?id=" + touristID);
		return mav;
	}
	
	
}
