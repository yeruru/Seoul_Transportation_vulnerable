package com.seoul.guide.like.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.like.DTO.likeDTO;
@Repository
public class likeDAOImpl implements likeDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	@Override
	public void insertlike(likeDTO like) throws Exception {
		sqlsession.insert("mapper.like.insertlike",like);
	}

	@Override
	public Integer selectlike(likeDTO like) throws Exception {
		return sqlsession.selectOne("mapper.like.selectlike", like);
	}

	@Override
	public void deletelike(likeDTO like) throws Exception {
		sqlsession.delete("mapper.like.deletelike", like);
	}

}
