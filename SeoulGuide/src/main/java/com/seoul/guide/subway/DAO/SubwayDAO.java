package com.seoul.guide.subway.DAO;

import java.util.List;
import java.util.Map;

import com.seoul.guide.subway.DTO.SubwayDTO;

public interface SubwayDAO {
	
	public List<SubwayDTO> selectSubwayLineByName(String name) throws Exception;
	public List<SubwayDTO> selectSubwayByName(String name) throws Exception;
	public SubwayDTO selectSubwayByNameAndLine(Map<String, String> param) throws Exception;
	
}
