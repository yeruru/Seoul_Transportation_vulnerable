package com.seoul.guide.member.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.member.DTO.FileVO;
import com.seoul.guide.member.DTO.MemberDTO;
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public void insertMember(MemberDTO member) throws Exception {
		sqlSession.insert("MemberMapper.memberAdd", member);
	}

    @Override
	public MemberDTO selectmember(String email) throws Exception {
		return sqlSession.selectOne("MemberMapper.memberselect", email);
	}
	
	
	
	
	@Override
	public void insertFile(FileVO file) throws Exception {
	    sqlSession.insert("file.mapper.insertFile", file);
	}

	@Override
	public Integer newFileId() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileVO selectFile(Integer id) throws Exception {
		return sqlSession.selectOne("file.mapper.selectFile", id);
	}

	
	
}
