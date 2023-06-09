package com.seoul.guide.comment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.comment.DAO.CommentDAO;
import com.seoul.guide.comment.DTO.CommentDTO;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentDAO commentDAO;

	@Override
	public void insertComment(CommentDTO commentDTO) throws Exception {
		commentDAO.insertComment(commentDTO);
	}

	@Override
	public List<CommentDTO> selectComment(Integer id) throws Exception {
		return commentDAO.selectComment(id);
	}

	@Override
	public CommentDTO OnselectComment(Integer id) throws Exception {
		return commentDAO.oneSelectComment(id);
	}

	@Override
	public void Delete(Integer id) throws Exception {
		commentDAO.deleteComment(id);
	}

	@Override
	public Integer selecttouristid(Integer id) throws Exception {
		return commentDAO.selecttouristid(id);
	}
}
