package com.seoul.guide.tour.Service;

import java.util.List;

import com.seoul.guide.tour.DTO.TourDTO;


public interface TourService {
	public List<TourDTO> gettourList() throws Exception;
}
