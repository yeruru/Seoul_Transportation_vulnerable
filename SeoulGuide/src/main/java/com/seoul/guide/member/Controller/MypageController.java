package com.seoul.guide.member.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.member.DTO.MemberDTO;
import com.seoul.guide.member.Service.MemberService;

@Controller
public class MypageController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	private HttpSession session;
		
//	@RequestMapping(value = "profile", method=RequestMethod.GET)
//	public ModelAndView profileView() {
//		 ModelAndView mav = new ModelAndView();
//
//		    // 회원 정보 조회
////		    Optional<MemberDTO> userOptional = memberService.findUser(userId);
////		    if (userOptional.isPresent()) {
////		        User user = userOptional.get();
////		        mav.addObject("user", user);
////		        mav.setViewName("mypage/profile");
////		    } else {
////		    	mav.setViewName("error"); // 회원 정보가 없는 경우 에러 페이지로 이동
////		    }
//
//		    return mav;
//	}
	
	@RequestMapping(value= "/profile", method=RequestMethod.GET)
	public String myPage(HttpSession session, Model model) {
		
		// HttpSession에서 로그인된 사용자 정보 가져오기
		Integer userId = (Integer) session.getAttribute("id");
        // 로그인된 사용자의 회원 정보와 파일 정보 조회
        MemberDTO member = memberService.getMemberWithImg(userId);
        System.out.println(member.getEmail());
        System.out.println(userId);
        model.addAttribute("member", member);
        
		return "myPage/profile";
	}

	
	@RequestMapping(value = "/modifyMember", method=RequestMethod.GET)
	public String modifyMemberView(HttpSession session, Model model) {
		// HttpSession에서 로그인된 사용자 정보 가져오기
        Integer userId = (Integer) session.getAttribute("id");
     // 로그인된 사용자의 회원 정보와 파일 정보 조회
        MemberDTO member = memberService.getMemberWithImg(userId);
        System.out.println(member.getUserId());
        System.out.println(userId);
        
        model.addAttribute("member", member);
        
		return "myPage/modifyMember";
	}
	
	@RequestMapping(value = "/modifyMember", method=RequestMethod.POST)
	public String updateMember(MemberDTO dto, Model model) {
		System.out.println(dto);
		
		return "myPage/modifyMember";
	}
	

}
