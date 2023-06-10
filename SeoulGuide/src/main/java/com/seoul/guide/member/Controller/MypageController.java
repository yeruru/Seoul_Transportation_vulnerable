package com.seoul.guide.member.Controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.seoul.guide.member.DTO.FileVO;
import com.seoul.guide.member.DTO.MemberDTO;
import com.seoul.guide.member.Service.MemberService;

@Controller
public class MypageController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private ServletContext servletContext;
		

	@RequestMapping(value= "/profile", method=RequestMethod.GET)
	public String myPage(HttpSession session, Model model) {
		
		// HttpSession에서 로그인된 사용자 정보 가져오기
        Integer userId = (Integer) session.getAttribute("id");
        // 로그인된 사용자의 회원 정보와 파일 정보 조회
        MemberDTO member;
		try {
			member = memberService.getMemberWithImg(userId);
			model.addAttribute("member", member);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("profile ERR");
		}
        
		return "myPage/profile";
	}

	
	@RequestMapping(value = "/modifyMember", method=RequestMethod.GET)
	public String modifyMemberView(Model model) {
		// HttpSession에서 로그인된 사용자 정보 가져오기
		Integer userId = (Integer) session.getAttribute("id");
     // 로그인된 사용자의 회원 정보와 파일 정보 조회
        MemberDTO member = new MemberDTO();
		try {
			member = memberService.getMemberWithImg(userId);
			model.addAttribute("member", member);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("modify ERR");
		}
        
        
		return "myPage/modifyMember";
	}
	
	
 	
	@RequestMapping(value = "/modifyMember/update", method=RequestMethod.POST)
	public String updateMember(Model model, @RequestParam(value="nickName")String nickName, @RequestPart(value="file",required=false) MultipartFile file) {
		Integer userId = (Integer) session.getAttribute("id");
		Map<String, Object> map = new HashMap<>();
		FileVO fileVO = new FileVO();
		try {
		    // 회원 정보 업데이트
			map.put("userId",userId);
			map.put("nickname",nickName);
			System.out.println(file.isEmpty());
		    // 이미지 업데이트
		    if (file != null && !file.isEmpty()) {
		    	String dir = servletContext.getRealPath("/resources/upload/");
				fileVO.setDirectory(dir);
		    	fileVO.setId(userId);
				fileVO.setName(file.getOriginalFilename());
				fileVO.setSize(file.getSize());
				fileVO.setContenttype(file.getContentType());
				fileVO.setData(file.getBytes());
				
				File dfile = new File(fileVO.getDirectory()+fileVO.getName());
				file.transferTo(dfile);
				
		    }else {
		    	fileVO = memberService.getFile(userId);
		    }
		    memberService.updateMemberWithImg(map, fileVO);
		    return "redirect:/";
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("POST Err");
		}
	    
		return "myPage/modifyMember";
	}
	
    @RequestMapping(value = "/modifyMember/delete", method = RequestMethod.POST)
    public String deleteMember() {
        Integer userId = (Integer) session.getAttribute("id");
        try {
            memberService.deleteMemberId(userId);
            session.removeAttribute("id");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Delete Member Error");
        }
        return "redirect:/";
    }
    
    @RequestMapping(value = "/modifyMember/nicknameCheck", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String nicknameCheck(@RequestParam("nickname") String nickname) {
        int result = 0;
        try {
            if (nickname.equals("")) {
                result = 2;
            } else {
                result = memberService.nicknameCheck(nickname); // 닉네임으로 중복 체크
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String message = "사용가능";
        if (result == 1) {
            message = "사용불가";
        } else if (result == 2) {
            message = "닉네임을 입력해주세요";
        }
        return message;
    }
		
}
