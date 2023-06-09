package com.seoul.guide.member.Service;

import java.io.File;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.seoul.guide.member.DAO.MemberDAO;
import com.seoul.guide.member.DTO.FileVO;
import com.seoul.guide.member.DTO.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private ServletContext servletContext;

	@Override
	public void join(MemberDTO member, MultipartFile file) throws Exception {

		if (file != null && !file.isEmpty()) {

			String dir = servletContext.getRealPath("/resources/upload/");
			System.out.println(dir);

			FileVO fileVO = new FileVO();
			fileVO.setDirectory(dir);
			fileVO.setName(file.getOriginalFilename());
			fileVO.setSize(file.getSize());
			fileVO.setContenttype(file.getContentType());
			fileVO.setId(memberDAO.newUserId());
			fileVO.setData(file.getBytes()); 
			memberDAO.insertFile(fileVO);

			File dfile = new File(fileVO.getDirectory()+fileVO.getName());
			System.out.println(fileVO.getId());
			file.transferTo(dfile); 


			member.setUserId(fileVO.getId());

		}
		memberDAO.insertMember(member);
	}

	@Override
	public void fileView(Integer id, OutputStream out) throws Exception {
		FileVO fileVo = memberDAO.selectFile(id);
		FileCopyUtils.copy(fileVo.getData(), out);
		out.flush();
	}

	@Override
	public void login(String email, String password) throws Exception {
		MemberDTO member = memberDAO.selectmember(email);
		if(member == null) throw new Exception("아이디 오류");
		if(member.getPassword().equals(password) == false) {
			throw new Exception("비밀번호 오류");
		}
	}

	@Override
	public int nicknameCheck(String nickname) throws Exception {
		int count = memberDAO.nicknameCheck(nickname);
		return count;
	}

	@Override
	public MemberDTO getMemberWithImg(Integer userId) {
		return memberDAO.selectMemberWithImg(userId);
	}

	
	//myPage

	public Integer selectuserid(String email) throws Exception {
		return memberDAO.selectID(email);
	}
	
	

}
