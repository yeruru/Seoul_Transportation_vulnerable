package com.seoul.guide.subway.Service;

import java.util.List;

import com.seoul.guide.subway.DTO.SubwayDTO;


public interface SubwayService {
//	public List<SubwayDTO> getSubwayList() throws Exception;
	public List<SubwayDTO> searchSubway(String name) throws Exception;
	
}
