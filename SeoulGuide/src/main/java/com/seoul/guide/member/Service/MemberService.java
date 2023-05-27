package com.seoul.guide.member.Service;

import java.io.OutputStream;

import org.springframework.web.multipart.MultipartFile;

import com.seoul.guide.member.DTO.MemberDTO;

public interface MemberService {
	void join(MemberDTO member, MultipartFile file) throws Exception;
	
	
	public void fileView(Integer id, OutputStream out) throws Exception;
}
