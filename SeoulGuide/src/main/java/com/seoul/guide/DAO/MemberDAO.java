package com.seoul.guide.DAO;

import com.seoul.guide.DTO.MemberDTO;

public interface MemberDAO {
	void insertMember(MemberDTO member) throws Exception;
}
