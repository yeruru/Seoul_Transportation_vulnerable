package com.seoul.guide.board.DAO;

import java.util.List;

import com.seoul.guide.board.DTO.Article;

public interface BoardDAO {
	public List<Article> selectBoardList() throws Exception;
	public Article selectBoard(Integer post_id) throws Exception;
	public Integer insertBoard(Article article) throws Exception;
}
