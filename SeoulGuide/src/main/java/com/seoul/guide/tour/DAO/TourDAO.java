package com.seoul.guide.tour.DAO;

import java.util.List;
import java.util.Map;

import com.seoul.guide.tour.DTO.TourDTO;

public interface TourDAO {
	public List<TourDTO> selecttourlist() throws Exception;
	public List<TourDTO> detailSearch(Map<String, Object> param) throws Exception;
}
