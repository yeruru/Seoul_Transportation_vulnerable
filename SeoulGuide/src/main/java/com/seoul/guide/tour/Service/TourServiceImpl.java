package com.seoul.guide.tour.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public List<TourDTO> detailSearch(String[] menu_icon, String tourist_subtitle) throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<String> list = Arrays.asList(menu_icon);
		System.out.println(list);
		map.put("menu_icon", list);
		map.put("tourist_subtitle", tourist_subtitle);
		return tourDAO.detailSearch(map);
	}

	@Override
	public List<TourDTO> Search(String word) throws Exception {
		return tourDAO.Search(word);
	}

	@Override
	public TourDTO detail(Integer id) throws Exception {
		System.out.println(id);
		return tourDAO.detail(id);
	}
	

}
