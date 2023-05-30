package com.seoul.guide.board.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.board.DAO.BoardDAO;
import com.seoul.guide.board.DTO.Article;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	@Override
	public List<Article> getBoardList() throws Exception {
		return boardDAO.selectBoardList();
	}

	@Override
	public Article getBoard(Integer post_id) throws Exception {
		return boardDAO.selectBoard(post_id);
	}

	@Override
	public Integer writeBoard(Article article) throws Exception {
		return boardDAO.insertBoard(article);
		
	}
}
