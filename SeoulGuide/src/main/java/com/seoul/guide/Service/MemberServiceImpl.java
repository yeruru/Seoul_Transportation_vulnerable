package com.seoul.guide.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.DAO.MemberDAO;
import com.seoul.guide.DTO.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public void join(MemberDTO member) throws Exception {
		memberDAO.insertMember(member);
	}

}
