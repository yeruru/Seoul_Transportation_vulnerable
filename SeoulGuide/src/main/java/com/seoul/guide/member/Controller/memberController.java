package com.seoul.guide.member.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class memberController {
	
	@RequestMapping(value = "loginform", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
}
