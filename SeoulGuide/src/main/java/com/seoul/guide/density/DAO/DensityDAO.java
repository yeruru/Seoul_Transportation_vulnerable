package com.seoul.guide.density.DAO;

import java.util.List;
import com.seoul.guide.density.DTO.DensityDTO;

//DensityDAO
public interface DensityDAO {
  void updateDensity(DensityDTO densityDTO) throws Exception;
  List<DensityDTO> selectAllDensityOrderByName(int offset, int rowsPerPage) throws Exception;
  List<DensityDTO> selectAllDensityOrderByDenseLvl(int offset, int rowsPerPage) throws Exception;
  List<DensityDTO> selectAllDensityUnsorted(int offset, int rowsPerPage) throws Exception; // 수정
  
  //페이지네이션 코드 
  int getTotalDensityCount() throws Exception;
  List<DensityDTO> selectAllDensityForUpdate() throws Exception;

  
}
