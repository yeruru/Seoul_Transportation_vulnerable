package com.seoul.guide.board.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.board.DTO.Article;
import com.seoul.guide.board.Service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/storyreview", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView tourReview() {
		ModelAndView mav = new ModelAndView();
		try {
			mav.addObject("boards", boardService.getBoardList());
			mav.setViewName("story/storyReview");
		} catch(Exception e) {
			e.printStackTrace();
			mav.addObject("err", "게시판 글 목록 조회 실패");
			mav.setViewName("err");
		}
		return mav;
	}
	
	
	@RequestMapping(value = "storydetail", method = RequestMethod.GET)
	public ModelAndView storyDetail(@RequestParam("post_id") Integer num) {
		ModelAndView mav = new ModelAndView();
		try {
			Article article = boardService.getBoard(num);
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

		try {
			Integer result = boardService.writeBoard(article);
			System.out.println(result);
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
	
	

	  @RequestMapping(value="/storyDetail", method=RequestMethod.POST) public
	  ModelAndView storyDetail(@RequestParam("user_id") Integer
	  user_id, @RequestParam("post_title") String post_title,
	  
	  @RequestParam("post_content") String post_content) { ModelAndView mav = new
	  ModelAndView(); try { boardService.modifyBoard(user_id, post_title,
	  post_content); } catch(Exception e) { e.printStackTrace(); }
	  mav.setViewName("redirect:/storyreview"); return mav; }
	 
	  
	  
	  
	  
	
	
	@RequestMapping(value="/storymodify", method=RequestMethod.GET)
	public String storyModify() {
		return "story/storyModify";
	}
	
	
	
	
	
}
