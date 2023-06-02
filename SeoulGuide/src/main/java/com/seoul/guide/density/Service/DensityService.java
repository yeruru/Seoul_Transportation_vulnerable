// DensityService.java
package com.seoul.guide.density.Service;

import com.seoul.guide.density.DTO.DensityDTO;
import java.util.List;

public interface DensityService {
    List<DensityDTO> selectAllDensity() throws Exception;
}
