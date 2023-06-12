package com.seoul.guide.board.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.board.DTO.BoardCommentVO;

@Repository
public class BoardCommnetDAOImpl implements BoardCommentDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public List<BoardCommentVO> commentList(Integer post_id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mapper.board.selectCommentList",post_id);
	}

	@Override
	public void insertComment(BoardCommentVO comment) throws Exception {
		 sqlSession.insert("mapper.board.insertComment",comment);
	}

	@Override
	public void updateComment(BoardCommentVO comment) throws Exception {
		sqlSession.update("mapper.board.updateComment",comment);
	}

	@Override
	public void deleteComment(Integer comment_id) throws Exception {
		sqlSession.delete("mapper.board.deleteComment",comment_id);
	}

	@Override
	public BoardCommentVO selectComment(BoardCommentVO comment) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("mapper.board.selectComment",comment);
	}

}
