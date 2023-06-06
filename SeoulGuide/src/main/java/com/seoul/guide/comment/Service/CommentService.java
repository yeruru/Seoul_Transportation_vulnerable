package com.seoul.guide.comment.Service;

import java.util.List;

import com.seoul.guide.comment.DTO.CommentDTO;

public interface CommentService {
	public void insertComment(CommentDTO commentDTO) throws Exception;
	public List<CommentDTO> selectComment(Integer id) throws Exception;
}
