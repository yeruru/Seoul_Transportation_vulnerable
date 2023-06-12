package com.seoul.guide.member.DAO;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.board.DTO.Article;
import com.seoul.guide.member.DTO.FileVO;
import com.seoul.guide.member.DTO.MemberDTO;
import com.seoul.guide.tour.DTO.TourDTO;
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
	public int nicknameCheck(String nickname) throws Exception {
		return sqlSession.selectOne("MemberMapper.nicknameCheck", nickname);
	}
	
	
	
	
	@Override
	public void insertFile(FileVO file) throws Exception {
	    sqlSession.insert("file.mapper.insertFile", file);
	}

	@Override
	public Integer newUserId() throws Exception {
		return sqlSession.selectOne("file.mapper.newFileId");
	}

	@Override
	public FileVO selectFile(Integer id) throws Exception {
		return sqlSession.selectOne("file.mapper.selectFile", id);
	}
	
	@Override
	public Integer selectID(String email) throws Exception {
		return sqlSession.selectOne("MemberMapper.selectuserid", email);
	}
	
	//profile
	@Override
	public MemberDTO selectMemberWithImg(Integer userId) throws Exception {
		return sqlSession.selectOne("MemberMapper.selectMemberWithImg", userId);
		
	}

	@Override
	public void updateMemberWithImg(Map<String,Object> map,FileVO file ) throws Exception {
		sqlSession.update("MemberMapper.updateMember", map);
		sqlSession.update("MemberMapper.updateImg", file); 
	}

	@Override
	public void deleteMember(Integer userId) throws Exception {
		sqlSession.delete("MemberMapper.deleteMember", userId);
	}

	@Override

	public Integer passwordsearch(String email) throws Exception {
		return sqlSession.selectOne("MemberMapper.passwordsearch",email);
	}
  
  @Override
	public List<Article> selectBoardList(Integer userId) throws Exception {
		return sqlSession.selectList("MemberMapper.selectBoardList", userId);
	}


	@Override
	public void passwordretry(MemberDTO member) throws Exception {
		sqlSession.update("MemberMapper.updatepassword", member);
	}

	@Override
	public List<TourDTO> selectTourList(Integer userId) throws Exception {
		return sqlSession.selectList("MemberMapper.selectTourList", userId);
	}
	
}
