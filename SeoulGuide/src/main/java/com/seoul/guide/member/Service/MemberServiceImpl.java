package com.seoul.guide.member.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.member.DAO.MemberDAO;
import com.seoul.guide.member.DTO.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public void join(MemberDTO member) throws Exception {
		memberDAO.insertMember(member);
	}

}
