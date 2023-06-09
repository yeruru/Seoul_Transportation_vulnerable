// DensityService.java
package com.seoul.guide.density.Service;

import java.util.List;
import com.seoul.guide.density.DTO.DensityDTO;

//DensityService.java
public interface DensityService {
 List<DensityDTO> selectAllDensity(int page, int rowsPerPage) throws Exception;
 void updateDensity(DensityDTO densityDTO) throws Exception;

 List<DensityDTO> selectAllDensityOrderByDenseLvl(int page, int rowsPerPage) throws Exception;
 List<DensityDTO> selectAllDensityOrderByName(int page, int rowsPerPage) throws Exception;
 List<DensityDTO> selectAllDensityUnsorted(int page, int rowsPerPage) throws Exception;

 
 List<DensityDTO> selectAllDensityForUpdate() throws Exception;
 int getTotalDensityCount() throws Exception;
 
}
