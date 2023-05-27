package com.seoul.guide.member.Service;

import java.io.File;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.seoul.guide.member.DAO.MemberDAO;
import com.seoul.guide.member.DTO.FileVO;
import com.seoul.guide.member.DTO.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;

	@Override
	public void join(MemberDTO member, MultipartFile file) throws Exception {

		if (file != null && !file.isEmpty()) {

			String dir = "C:/SH/upload/";

			FileVO fileVO = new FileVO();

			fileVO.setDirectory(dir);
			fileVO.setName(file.getOriginalFilename());
			fileVO.setSize(file.getSize());
			fileVO.setContenttype(file.getContentType());
			fileVO.setId(memberDAO.newFileId());
			/* fileVO.setData(file.getBytes()); */
			memberDAO.insertFile(fileVO);

			File dfile = new File(fileVO.getDirectory() + fileVO.getId());
			file.transferTo(dfile); 

			member.setFileid(fileVO.getId());
		}
		memberDAO.insertMember(member);
	}

	@Override
	public void fileView(Integer id, OutputStream out) throws Exception {

	}

}
