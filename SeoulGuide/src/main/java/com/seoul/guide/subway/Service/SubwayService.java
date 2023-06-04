package com.seoul.guide.subway.Service;

import java.util.List;

import com.seoul.guide.subway.DTO.SubwayDTO;


public interface SubwayService {
	public List<SubwayDTO> searchSubwayByName(String name) throws Exception;
	public List<SubwayDTO> findSubwayLineByName(String name) throws Exception;
}
