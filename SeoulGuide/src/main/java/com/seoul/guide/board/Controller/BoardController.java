package com.seoul.guide.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	@RequestMapping(value = "storywrite", method = RequestMethod.GET)
	public String boardWrite() {
		return "story/storyWrite";
	}
	
	@RequestMapping(value = "storyreview", method = RequestMethod.GET)
	public String tourReview() {
		return "story/storyReview";
	}
	
	@RequestMapping(value = "storydetail", method = RequestMethod.GET)
	public String storyDetail() {
		return "story/storyDetail";
	}
}
