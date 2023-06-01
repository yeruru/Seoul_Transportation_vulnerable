// DensityServiceImpl.java
package com.seoul.guide.density.Service;

import com.seoul.guide.density.DAO.DensityDAO;
import com.seoul.guide.density.DTO.DensityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DensityServiceImpl implements DensityService {
    @Autowired
    DensityDAO densityDAO;

    @Override
    public List<DensityDTO> selectAllDensity() throws Exception {
        return densityDAO.selectAllDensity();
    }
}
