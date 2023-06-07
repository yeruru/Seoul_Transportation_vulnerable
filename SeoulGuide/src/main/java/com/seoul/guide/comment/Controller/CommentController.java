package com.seoul.guide.comment.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.seoul.guide.comment.DTO.CommentDTO;
import com.seoul.guide.comment.Service.CommentService;

@Controller
public class CommentController {
	@Autowired
	private CommentService commentService;

	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/commentinsert", method= RequestMethod.POST)
	@ResponseBody
	public void insertComment(@RequestParam(value = "tourist_id") Long tourist_id, @ModelAttribute CommentDTO commentDTO) throws Exception {
		System.out.println(tourist_id);
		String email = (String) session.getAttribute("email");
		Integer id = tourist_id.intValue();
		commentDTO.setMember_email(email);
		commentDTO.setTourist_id(id);
		commentService.insertComment(commentDTO);
	}

	
	/*
	 * @RequestMapping(value = "/commentselect", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public ModelAndView getComments(@RequestParam(value
	 * ="tourist_id", defaultValue="2") Long tourist_id) throws Exception {
	 * System.out.println(tourist_id); Integer id = tourist_id.intValue();
	 * List<CommentDTO> comments = commentService.selectComment(id);
	 * 
	 * ModelAndView mav = new ModelAndView(); mav.setViewName("tour/tourdetail");
	 * mav.addObject("comments", comments); return mav; }
	 */

}
