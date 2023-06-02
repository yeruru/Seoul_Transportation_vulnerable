package com.seoul.guide.tour.DAO;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.tour.DTO.TourDTO;
@Repository
public class TourDAOImpl implements TourDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	@Override
	public List<TourDTO> selecttourlist() throws Exception {
		return sqlsession.selectList("mapper.tour.selecttourlist");
	}
	
	@Override
	public List<TourDTO> detailSearch(Map<String, Object> param) throws Exception {
		return sqlsession.selectList("mapper.tour.searchdetail", param);
	}

	@Override
	public List<TourDTO> Search(String word) throws Exception {
		return sqlsession.selectList("mapper.tour.search", word);
	}

	@Override
	public TourDTO detail(Integer id) throws Exception {
		return sqlsession.selectOne("mapper.tour.detail", id);
	}
	
	

}
