package com.seoul.guide.density.DAO;

import java.util.List;

import com.seoul.guide.density.DTO.DensityDTO;

public interface DensityDAO {
    List<DensityDTO> selectAllDensity() throws Exception;
    void updateDensity(DensityDTO densityDTO) throws Exception;
    List<DensityDTO> selectAllDensityOrderByDenseLvl() throws Exception;
    List<DensityDTO> selectAllDensityOrderByName() throws Exception;
    List<DensityDTO> selectAllDensityUnsorted() throws Exception; // 추가
}
