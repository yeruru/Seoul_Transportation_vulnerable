package com.seoul.guide.subway.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<SubwayDTO> searchSubway(String name) throws Exception {
		if(name==null || name.trim().length() == 0) {
			return null;
		} 
		Map<String, Object> map= new HashMap<>();
		map.put("name", name);
		System.out.println(subwayDAO.selectSubwayByName(map));
		return subwayDAO.selectSubwayByName(map);
	}

//	@Override
//	public List<SubwayDTO> getSubwayList() throws Exception {
//		// TODO Auto-generated method stub
//		return subwayDAO.selectSubwayList();
//	}

}
