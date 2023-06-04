package com.seoul.guide.subway.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.subway.DAO.SubwayDAO;
import com.seoul.guide.subway.DTO.SubwayDTO;

@Service
public class SubwayServiceImpl implements SubwayService {
	
	@Autowired
	private SubwayDAO subwayDAO;
	
	public void setSubwayDAO(SubwayDAO subwayDAO) {
		this.subwayDAO = subwayDAO;
	}

	@Override
	public List<SubwayDTO> searchSubwayByName(String name) throws Exception {
		if(name==null || name.trim().length() == 0) {
			return null;
		} 
		System.out.println(subwayDAO.selectSubwayByName(name));
		return subwayDAO.selectSubwayByName(name);
	}

	@Override
	public List<SubwayDTO> findSubwayLineByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return subwayDAO.selectSubwayLineByName(name);
	}

//	@Override
//	public List<SubwayDTO> getSubwayList() throws Exception {
//		// TODO Auto-generated method stub
//		return subwayDAO.selectSubwayList();
//	}

}
