package com.seoul.guide.member.Service;

import com.seoul.guide.member.DTO.MemberDTO;

public interface MemberService {
	void join(MemberDTO member) throws Exception;
}
