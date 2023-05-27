package com.seoul.guide.member.DAO;

import com.seoul.guide.member.DTO.FileVO;
import com.seoul.guide.member.DTO.MemberDTO;

public interface MemberDAO {
	MemberDTO selectmember(String email) throws Exception;
	void insertMember(MemberDTO member) throws Exception;
	
	public void insertFile(FileVO file) throws Exception;
	public Integer newFileId() throws Exception;
	public FileVO selectFile(Integer id) throws Exception;
}
