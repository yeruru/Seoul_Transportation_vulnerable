package com.seoul.guide.member.Controller;

import java.io.IOException;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.member.DTO.MemberDTO;
import com.seoul.guide.member.Service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memeberservice;
	
	@Autowired
	private JavaMailSenderImpl mailSender;
	
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
		    Integer id = memeberservice.selectuserid(email);
		    System.out.println(id);
			session.setAttribute("id", id);
			mav.setViewName("redirect:/");
		}catch(Exception e) {
			e.printStackTrace();
			mav.addObject("err", e.getMessage());
			mav.setViewName("member/err");
		}
		return mav;
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String logout() {
		session.removeAttribute("id");
		return "redirect:/";
	}
	
	@RequestMapping(value="/nicknameCheck", produces = "text/plain;charset=UTF-8")
	@ResponseBody 
	public String nickanmeCheck(@RequestParam("nickname") String nickname, @RequestParam("pw") String pw) {
		int result = 0;
		try {
			result = memeberservice.nicknameCheck(nickname);
			if(nickname == "") {
				result = 2;
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		String mesg = "사용가능";
		if(result==1) {
			mesg = "사용불가";
		}else if(result == 2) {
			mesg = "닉네임을 입력해주세요";
		}
		return mesg;		
	}
	
	@RequestMapping(value = "/mailCheck", method = RequestMethod.GET)
	@ResponseBody
	public String mailCheck(@RequestParam("sm_email") String sm_email) throws Exception{
	    int serti = (int)((Math.random()* (99999 - 10000 + 1)) + 10000);
	    
	    String from = "cjstmdgusqw@naver.com";//보내는 이 메일주소
	    String to = sm_email;
	    String title = "회원가입시 필요한 인증번호 입니다.";
	    String content = "[인증번호] "+ serti +" 입니다. <br/> 인증번호 확인란에 기입해주십시오.";
	    String num = "";
	    try {
	    	MimeMessage mail = mailSender.createMimeMessage();
	        MimeMessageHelper mailHelper = new MimeMessageHelper(mail, true, "UTF-8");
	        mailHelper.setFrom(from);
	        mailHelper.setTo(to);
	        mailHelper.setSubject(title);
	        mailHelper.setText(content, true);  
	        mailSender.send(mail);
	        num = Integer.toString(serti);
	        
	    } catch(Exception e) {
	        num = "error";
	    }
	    return num;
	}
	
	@RequestMapping(value="/passwordcheckform", method= RequestMethod.GET)
	public String passwordcheckform() {
		return "member/passwordcheck";
	}
	
	@RequestMapping(value="passwordsearch", method=RequestMethod.POST)
	public ModelAndView passwordsearch(@RequestParam("email") String email) throws Exception {
		Integer count = memeberservice.passwordsearch(email);
		ModelAndView mav = new ModelAndView();
		
		if(count == 1) { 
			mav.addObject("email", email);
			mav.setViewName("member/passwordretry"); 
		}else {
			mav.setViewName("member/passwordfail"); 
		}
		return mav;
		
	}
	
	@RequestMapping(value="/passwordretry", method= RequestMethod.GET)
	public String passwordretry() {
		return "member/passwordretry";
	}
	
	@RequestMapping(value="passworupdate", method=RequestMethod.POST)
	public ModelAndView update(@RequestParam("email") String email, @RequestParam("password") String password, @ModelAttribute MemberDTO member ) throws Exception {
		ModelAndView mav = new ModelAndView();
		member.setEmail(email);
		member.setPassword(password);
		memeberservice.passwordretry(member);
		mav.setViewName("member/password");
		return mav;
	}
	
	@RequestMapping(value="password", method=RequestMethod.GET)
	public String sucess() {
		return "member/password";
	}
	
	@RequestMapping(value="passwordfail" ,method=RequestMethod.GET)
	public String false2() {
		return "member/passwordfail";
	}
}

	
