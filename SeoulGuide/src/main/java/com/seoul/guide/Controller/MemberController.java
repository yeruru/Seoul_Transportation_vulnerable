package com.seoul.guide.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.DTO.MemberDTO;
import com.seoul.guide.Service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "tour";
	}
	
	@RequestMapping(value = "/header", method = RequestMethod.GET)
	public String tour() {
		return "header";
	}
	
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public ModelAndView join(@ModelAttribute MemberDTO member) {
		ModelAndView mav = new ModelAndView();
		try {
			memberService.join(member);
			mav.setViewName("redirect:/");
		}catch(Exception e) {
			e.printStackTrace();
			mav.addObject("err","회원가입실패");
			mav.setViewName("err");
		}
		return mav;
	}
}
