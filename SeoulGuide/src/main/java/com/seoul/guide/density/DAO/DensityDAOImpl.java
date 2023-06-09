package com.seoul.guide.density.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.density.DTO.DensityDTO;

//DensityDAOImpl
@Repository
public class DensityDAOImpl implements DensityDAO {
	@Autowired
	SqlSession sqlSession;

	@Override
	public void updateDensity(DensityDTO densityDTO) throws Exception {
		sqlSession.update("mapper.density.updateDensity", densityDTO);
	}

	@Override
	public List<DensityDTO> selectAllDensityOrderByDenseLvl(int offset, int rowsPerPage) throws Exception {
		Map<String, Integer> params = new HashMap<>();
		params.put("offset", offset);
		params.put("rowsPerPage", rowsPerPage);
		return sqlSession.selectList("mapper.density.selectAllDensityOrderByDenseLvl", params);
	}

	@Override
	public List<DensityDTO> selectAllDensityOrderByName(int offset, int rowsPerPage) throws Exception {
		Map<String, Integer> params = new HashMap<>();
		params.put("offset", offset);
		params.put("rowsPerPage", rowsPerPage);
		return sqlSession.selectList("mapper.density.selectAllDensityOrderByName", params);
	}

	@Override
	public List<DensityDTO> selectAllDensityUnsorted(int offset, int rowsPerPage) throws Exception {
		Map<String, Integer> params = new HashMap<>();
		params.put("offset", offset);
		params.put("rowsPerPage", rowsPerPage);
		return sqlSession.selectList("mapper.density.selectAllDensityUnsorted", params); // 수정
	}
	
	//페이지네이션 
	@Override
	public int getTotalDensityCount() throws Exception {
	    return sqlSession.selectOne("mapper.density.getTotalDensityCount");
	}	
	@Override
	public List<DensityDTO> selectAllDensityForUpdate() throws Exception {
	    return sqlSession.selectList("mapper.density.selectAllDensity");
	}

	
	

}
