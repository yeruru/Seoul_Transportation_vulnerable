package com.seoul.guide.density.DAO;

import com.seoul.guide.density.DTO.DensityDTO;
import java.util.List;

public interface DensityDAO {
    List<DensityDTO> selectAllDensity() throws Exception;
}
