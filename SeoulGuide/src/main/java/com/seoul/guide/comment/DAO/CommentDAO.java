package com.seoul.guide.comment.DAO;

import java.util.List;

import com.seoul.guide.comment.DTO.CommentDTO;

public interface CommentDAO {
	public void insertComment(CommentDTO commentDTO) throws Exception;
	public List<CommentDTO> selectComment(Integer id) throws Exception;
}
