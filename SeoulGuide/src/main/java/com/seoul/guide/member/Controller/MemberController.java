package com.seoul.guide.member.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.member.DTO.MemberDTO;
import com.seoul.guide.member.Service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memeberservice;
	
	@RequestMapping(value = "loginform", method = RequestMethod.GET)
	public String login() {
		return "member/login";
	}
	
	@RequestMapping(value = "joinagreeform", method = RequestMethod.GET)
	public String joinagree() {
		return "member/joinagree";
	}
	
	@RequestMapping(value = "joinform", method = RequestMethod.GET)
	public String join() {
		return "member/join";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public ModelAndView join(@ModelAttribute MemberDTO member) {
		ModelAndView mav = new ModelAndView();
		try {
			memeberservice.join(member);
			mav.setViewName("member/login");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mav;
		
	}
	
}
