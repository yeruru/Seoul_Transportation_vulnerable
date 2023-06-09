package com.seoul.guide.board.DAO;

import java.util.List;
import java.util.Map;

import com.seoul.guide.board.DTO.Article;

//BoardDAO
public interface BoardDAO {
	public List<Article> selectBoardList() throws Exception;
	public Article selectBoard(Integer post_id) throws Exception;
	public Integer insertBoard(Article article) throws Exception;
	public void updateBoard(Map<String,Object> param) throws Exception;
	public void deleteBoard(Integer post_id) throws Exception;
	
	//검색기능용코드
    public List<Article> selectBoardListBySearch(String search) throws Exception;
}