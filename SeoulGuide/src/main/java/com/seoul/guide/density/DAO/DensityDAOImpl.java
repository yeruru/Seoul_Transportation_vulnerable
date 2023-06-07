package com.seoul.guide.density.DAO;

import java.util.List;

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
    public List<DensityDTO> selectAllDensity() throws Exception {
        return sqlSession.selectList("mapper.density.selectAllDensity");
    }
    
    @Override
    public void updateDensity(DensityDTO densityDTO) throws Exception {
        sqlSession.update("mapper.density.updateDensity", densityDTO);
    }

    @Override
    public List<DensityDTO> selectAllDensityOrderByDenseLvl() throws Exception {
        return sqlSession.selectList("mapper.density.selectAllDensityOrderByDenseLvl");
    }

    @Override
    public List<DensityDTO> selectAllDensityOrderByName() throws Exception {
        return sqlSession.selectList("mapper.density.selectAllDensityOrderByName");
    }

    @Override
    public List<DensityDTO> selectAllDensityUnsorted() throws Exception {
        return sqlSession.selectList("mapper.density.selectAllDensityUnsorted"); // 추가
    }
}

