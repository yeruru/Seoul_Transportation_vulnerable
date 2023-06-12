package com.seoul.guide.board.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.board.DAO.BoardCommentDAO;
import com.seoul.guide.board.DTO.BoardCommentVO;

@Service
public class BoardCommentServiceImpl implements BoardCommentService {
	
	@Autowired
	private BoardCommentDAO boardCommentDAO;

	@Override
	public List<BoardCommentVO> commentList(Integer post_id) throws Exception {
		return boardCommentDAO.commentList(post_id);
	}

	@Override
	public void writeComment(BoardCommentVO comment) throws Exception {
		boardCommentDAO.insertComment(comment);
	}

	@Override
	public void modifyComment(BoardCommentVO comment) throws Exception {
		boardCommentDAO.updateComment(comment);
	}

	@Override
	public void removeComment(Integer comment_id) throws Exception {
		boardCommentDAO.deleteComment(comment_id);
	}

	@Override
	public BoardCommentVO checkComment(BoardCommentVO comment) throws Exception {
		return boardCommentDAO.selectComment(comment);
	}


}
