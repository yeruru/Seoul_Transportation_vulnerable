package com.seoul.guide.board.Service;

import java.util.List;
import com.seoul.guide.board.DTO.Article;


public interface BoardService {
	public List<Article> getBoardList() throws Exception;
	public Article getBoard(Integer post_id) throws Exception;
	public Integer writeBoard(Article article) throws Exception;
}
