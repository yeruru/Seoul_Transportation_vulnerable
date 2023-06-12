package com.seoul.guide.board.DAO;

import java.util.List;

import com.seoul.guide.board.DTO.BoardCommentVO;

public interface BoardCommentDAO {
	
	//댓글 조회
	public List<BoardCommentVO> commentList(Integer post_id) throws Exception;
	
	//댓글 작성
	public void insertComment(BoardCommentVO comment) throws Exception;
	
	//댓글 수정
	public void updateComment(BoardCommentVO comment) throws Exception;
	
	//댓글 삭제
	public void deleteComment(Integer comment_id) throws Exception;
	
	//단일 댓글 조회
	public BoardCommentVO selectComment(BoardCommentVO comment) throws Exception;
	
}
