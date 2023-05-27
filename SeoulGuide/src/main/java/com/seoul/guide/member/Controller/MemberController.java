package com.seoul.guide.member.Controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.member.DTO.MemberDTO;
import com.seoul.guide.member.Service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memeberservice;
	
	@Autowired
	private HttpSession session;
	
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
	public ModelAndView join(@ModelAttribute MemberDTO member ,@RequestPart(value="file",required=false) MultipartFile file) throws Exception {
		ModelAndView mav = new ModelAndView();
		try {
			memeberservice.join(member, file);
			mav.setViewName("member/login");
		}catch(IOException e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("email") String email, @RequestParam("password") String password) {
		ModelAndView mav = new ModelAndView();
		try {
			memeberservice.login(email, password);
			session.setAttribute("email", email);
			mav.setViewName("redirect:/");
		}catch(Exception e) {
			e.printStackTrace();
			mav.addObject("err", e.getMessage());
			mav.setViewName("member/err");
		}
		return mav;
	}
	
}
