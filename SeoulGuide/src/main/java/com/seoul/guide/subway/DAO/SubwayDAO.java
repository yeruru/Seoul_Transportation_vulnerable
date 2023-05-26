package com.seoul.guide.subway.DAO;

import java.util.List;
import java.util.Map;

import com.seoul.guide.subway.DTO.SubwayDTO;

public interface SubwayDAO {
	
//	public List<SubwayDTO> selectSubwayList() throws Exception;
	public List<SubwayDTO> selectSubwayByName(Map<String,Object> param) throws Exception;
	
	
}
