package com.seoul.guide.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.DTO.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void insertMember(MemberDTO member) throws Exception {
		sqlSession.insert("mapper.member.insertMember", member);
	}

}
