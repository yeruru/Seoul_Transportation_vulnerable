package com.seoul.guide.member.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class main {

	@Autowired
	HttpSession session;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Main() {

		return "main";
		
	}
	

//	@RequestMapping(value = "/subway", method = RequestMethod.GET) 
//	public String subway() {
//		return "subway";
//	}

	
}