package com.seoul.guide.board.Controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.board.DTO.BoardCommentVO;
import com.seoul.guide.board.Service.BoardCommentService;

@Controller
//@RequestMapping("/storydetail/*") 
public class BoardCommentController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private BoardCommentService bCommentService;
	
	@RequestMapping(value = "/storydetail", method = RequestMethod.POST)
	public ModelAndView commentWrite(@ModelAttribute BoardCommentVO comment, @RequestParam(value = "post_id") Integer post_id) {
	    ModelAndView mav = new ModelAndView();
	    Integer userId = (Integer) session.getAttribute("id");
	    try {
	        comment.setUser_id(userId);
	        comment.setB_comment_reg(new Date());
	        bCommentService.writeComment(comment);
	        mav.addObject("comment", comment);
	        mav.setViewName("story/storyDetail");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    mav.setViewName("redirect:/storydetail?post_id=" + comment.getPost_id()); // 댓글 작성 후 해당 게시물 상세 페이지로 리다이렉트
	    return mav;
	}
	
	
	
	@RequestMapping(value = "/storydetail/modify", method = RequestMethod.GET)
	public String commentModifyForm(@RequestParam("post_id") Integer post_id, @RequestParam("comment_id") Integer comment_id, Model model) {
		
		try {
			BoardCommentVO vo = new BoardCommentVO();
			vo.setPost_id(post_id);
			vo.setComment_id(comment_id);
			BoardCommentVO comment = bCommentService.checkComment(vo);
			System.out.println(comment.getPost_id());
			System.out.println(comment.getComment_id());
			model.addAttribute("comment", comment );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결실패");
		}
		return "story/storyComment";
	}
	
	@RequestMapping(value="/storydetail/modify", method = RequestMethod.POST)
	public String commentModify(BoardCommentVO commentVO) {
	 Integer userId = (Integer) session.getAttribute("id");
	 
	 try {
		  // 로그인한 사용자와 댓글 작성자가 일치하는지 확인
		 BoardCommentVO existingComment = bCommentService.checkComment(commentVO);
		 if (existingComment != null && userId != null && userId.equals(existingComment.getUser_id())) {
		 commentVO.setUser_id(userId);
		 commentVO.setB_comment_chg(new Date());
		 bCommentService.modifyComment(commentVO);
		 }else {
			 throw new Exception("댓글 수정 권한이 없습니다.");
         }
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	return "redirect:/storydetail?post_id=" + commentVO.getPost_id();
			
	}
	
	@RequestMapping(value = "/storydetail/delete", method = RequestMethod.POST)
	public String commentDelete( @RequestParam(value = "post_id") Integer post_id, @RequestParam(value="comment_id") Integer comment_id) {
		try {
			System.out.println(comment_id);
			System.out.println(post_id);
			bCommentService.removeComment(comment_id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/storydetail?post_id=" + post_id;
	}

}
