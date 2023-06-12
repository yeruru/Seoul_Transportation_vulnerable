package com.seoul.guide.board.Service;

import java.util.List;

import com.seoul.guide.board.DTO.BoardCommentVO;

public interface BoardCommentService {

	// 댓글조회
	public List<BoardCommentVO> commentList(Integer post_id) throws Exception;

	// 댓글 작성
	public void writeComment(BoardCommentVO comment) throws Exception;

	// 댓글 수정
	public void modifyComment(BoardCommentVO comment) throws Exception;

	// 댓글 삭제
	public void removeComment(Integer comment_id) throws Exception;
	
	//단일 댓글 조회
	public BoardCommentVO checkComment(BoardCommentVO comment) throws Exception;
}
