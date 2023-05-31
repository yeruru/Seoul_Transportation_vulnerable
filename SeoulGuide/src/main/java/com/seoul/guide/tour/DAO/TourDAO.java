package com.seoul.guide.tour.DAO;

import java.util.List;

import com.seoul.guide.tour.DTO.TourDTO;

public interface TourDAO {
	public List<TourDTO> selecttourlist() throws Exception;

}
