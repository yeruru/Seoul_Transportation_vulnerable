package com.seoul.guide.comment.DAO;

import java.util.List;
import java.util.Map;

import com.seoul.guide.comment.DTO.CommentDTO;

public interface CommentDAO {
	public void insertComment(CommentDTO commentDTO) throws Exception;
	public List<CommentDTO> selectComment(Integer id) throws Exception;
	public CommentDTO oneSelectComment(Integer id) throws Exception;
	public void deleteComment(Integer id) throws Exception;
	public Integer selecttouristid(Integer id) throws Exception;
}
