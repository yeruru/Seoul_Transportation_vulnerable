package com.seoul.guide.comment.DAO;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.comment.DTO.CommentDTO;

@Repository
public class CommentDAOImpl implements CommentDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	@Override
	public void insertComment(CommentDTO commentDTO) throws Exception {
		sqlsession.insert("mapper.comment.insertcomment", commentDTO);
	}

	@Override
	public List<CommentDTO> selectComment(Integer id) throws Exception {
		return sqlsession.selectList("mapper.comment.selectcomment",id);
	}

	@Override
	public CommentDTO oneSelectComment(Integer id) throws Exception {
		return sqlsession.selectOne("mapper.comment.Oneselectcomment", id);
	}

	@Override
	public void deleteComment(Integer id) throws Exception {
		sqlsession.delete("mapper.comment.deleteComment",id);
	}

	@Override
	public Integer selecttouristid(Integer id) throws Exception {
		return sqlsession.selectOne("mapper.comment.selecttouristID", id);
		
	}


}
