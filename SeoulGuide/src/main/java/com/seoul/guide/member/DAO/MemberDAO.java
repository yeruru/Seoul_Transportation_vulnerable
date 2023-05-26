package com.seoul.guide.member.DAO;

import com.seoul.guide.member.DTO.MemberDTO;

public interface MemberDAO {
	void insertMember(MemberDTO member) throws Exception;
}
