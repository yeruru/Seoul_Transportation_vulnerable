package com.seoul.guide.tour.DAO;

import java.util.List;

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

}
