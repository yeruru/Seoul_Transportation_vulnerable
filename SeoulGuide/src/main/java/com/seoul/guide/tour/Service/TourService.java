package com.seoul.guide.tour.Service;

import java.util.List;

import com.seoul.guide.tour.DTO.TourDTO;


public interface TourService {
	public List<TourDTO> gettourList() throws Exception;
	public List<TourDTO> detailSearch(String[] menu_icon, String tourist_subtitle) throws Exception;
}
