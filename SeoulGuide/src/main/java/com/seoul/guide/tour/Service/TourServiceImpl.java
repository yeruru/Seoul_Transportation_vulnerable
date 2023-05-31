package com.seoul.guide.tour.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.tour.DAO.TourDAO;
import com.seoul.guide.tour.DTO.TourDTO;
@Service
public class TourServiceImpl implements TourService {
	
	@Autowired
	private TourDAO tourDAO;

	@Override
	public List<TourDTO> gettourList() throws Exception {
		return tourDAO.selecttourlist();
	}

}
