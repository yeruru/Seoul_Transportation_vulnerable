package com.seoul.guide.density.DAO;

import com.seoul.guide.density.DTO.DensityDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DensityDAOImpl implements DensityDAO {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<DensityDTO> selectAllDensity() throws Exception {
        return sqlSession.selectList("mapper.density.selectAllDensity");
    }
}
