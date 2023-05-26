package com.seoul.guide.subway.DAO;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.subway.DTO.SubwayDTO;

@Repository
public class SubwayDAOImpl implements SubwayDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<SubwayDTO> selectSubwayByName(Map<String, Object> param) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(param);
		return sqlSession.selectList("mapper.subway.selectSubwayByName",param);
	}

//	@Override
//	public List<SubwayDTO> selectSubwayList() throws Exception {
//		// TODO Auto-generated method stub
//		return sqlSession.selectList("mapper.subway.selectSubwayList");
//	}
	

}
