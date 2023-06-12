package com.seoul.guide.board.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.board.DTO.Article;
import com.seoul.guide.board.DTO.BoardCommentVO;
import com.seoul.guide.board.Service.BoardCommentService;
import com.seoul.guide.board.Service.BoardService;

//BoardController
@Controller
public class BoardController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private BoardCommentService boardCommentService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		return "test";
	}
	

	//검색기능 추가
	@RequestMapping(value = "/storyreview", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView tourReview(@RequestParam(value = "search", required = false) String search) {
	    ModelAndView mav = new ModelAndView();
	    try {
	        if (search != null && !search.isEmpty()) {
	            mav.addObject("boards", boardService.searchBoardList(search));
	        } else {
	            mav.addObject("boards", boardService.getBoardList());
	        }
	        mav.setViewName("story/storyReview");
	    } catch(Exception e) {
	        e.printStackTrace();
	        mav.addObject("err", "게시판 글 목록 조회 실패");
	        mav.setViewName("err");
	    }
	    return mav;
	}

	
	//조회수 관리로직  추가함!
	@RequestMapping(value = "storydetail", method = RequestMethod.GET)
	public ModelAndView storyDetail(@RequestParam("post_id") Integer num) {
		List<BoardCommentVO> comment =null;
		ModelAndView mav = new ModelAndView();
		try {
			Article article = boardService.getBoard(num);
			boardService.incrementViewCount(num); // 추가된 부분
			//댓글 
			comment = boardCommentService.commentList(num);
			
			mav.addObject("comment", comment);
			mav.addObject("article", article);
			mav.setViewName("story/storyDetail");
		} catch(Exception e) {
			e.printStackTrace();
			mav.addObject("err", "글 상세 조회 실패");
			mav.setViewName("err");
		}
		return mav;
	}

	
	@RequestMapping(value="/writeform", method=RequestMethod.GET)
	public String writeform() {
		return "story/writeform";
	}
	
	
	@RequestMapping(value="/storywrite", method=RequestMethod.POST)
	public ModelAndView storyWrite(@ModelAttribute Article article) {
		ModelAndView mav = new ModelAndView();
		Integer userId = (Integer)session.getAttribute("id");
		try {
			article.setUser_id(userId);
			Integer result = boardService.writeBoard(article);
			if(result == 0) {
				throw new Exception("실패");
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		mav.setViewName("redirect:/storyreview");
		return mav;
	}
	

	@RequestMapping(value = "/storymodify", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView storyModify(@RequestParam("post_id") Integer post_id) {
		Integer userId = (Integer)session.getAttribute("id");
	    ModelAndView mav = new ModelAndView();
	    try {
	        Article article =  boardService.getBoard(post_id);
	        if (userId != null && userId.equals(article.getUser_id())) {
	            mav.addObject("article", article);
	            mav.setViewName("story/storyModify");
	        } else {
	            mav.addObject("err", "해당 글을 수정할 권한이 없습니다.");
	            mav.setViewName("err");
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	        mav.addObject("err", "글 수정 폼 조회 실패");
	        mav.setViewName("err");
	    }
	    return mav;
	}
	


	
	@RequestMapping(value = "/storyModifyAction", method = RequestMethod.POST)
	public ModelAndView storyModifyAction(@RequestParam("post_id") Integer post_id, @RequestParam("title") String post_title,
	        @RequestParam("content") String post_content) {
	    ModelAndView mav = new ModelAndView();
	    System.out.println("enter Controller");
	    System.out.println(post_id);
	    System.out.println(post_title);
	    System.out.println(post_content.isEmpty());
	    try {
			boardService.modifyBoard(post_id, post_title, post_content); 
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		mav.setViewName("redirect:/storyreview");
		return mav;
	}
	
	@RequestMapping(value = "storydelete", method = RequestMethod.POST)
	public String storyDelete(@RequestParam("post_id") Integer post_id) {
		 try {
			 	System.out.println(post_id);
                boardService.delete(post_id);
                System.out.println("게시글이 삭제되었습니다.");
                // 삭제 후 목록 페이지로 리다이렉트
		    } catch (Exception e) {
		        e.printStackTrace();
		        System.out.println("게시글 삭제에 실패했습니다: " + e.getMessage());
		    }
		    return "redirect:/storyreview";
  }
	
	
	

}
