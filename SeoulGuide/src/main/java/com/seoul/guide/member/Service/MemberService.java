package com.seoul.guide.member.Service;

import java.io.OutputStream;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.seoul.guide.member.DTO.FileVO;
import com.seoul.guide.member.DTO.MemberDTO;

public interface MemberService {
	void join(MemberDTO member, MultipartFile file) throws Exception;
	void login(String email, String password) throws Exception;
	public int nicknameCheck(String nickname) throws Exception;
	public Integer selectuserid(String email) throws Exception;
	
	public void fileView(Integer id, OutputStream out) throws Exception;
	public Integer passwordsearch(String email) throws Exception;
	public void passwordretry(MemberDTO member) throws Exception;
	
	//마이페이지
	//회원 정보와 파일 정보를 함께 조회하는 메서드
    public MemberDTO getMemberWithImg(Integer userId) throws Exception;
    public void updateMemberWithImg(Map<String,Object> map, FileVO file) throws Exception;
    
    public FileVO getFile(Integer id) throws Exception;
    public void deleteMemberId(Integer userId) throws Exception;
}
