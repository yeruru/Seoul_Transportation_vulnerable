package com.seoul.guide.member.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.member.DTO.MemberDTO;
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void insertMember(MemberDTO member) throws Exception {
		sqlSession.insert("MemberMapper.memberAdd", member);
	}
}
