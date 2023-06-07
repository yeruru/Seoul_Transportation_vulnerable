// DensityServiceImpl.java
package com.seoul.guide.density.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.density.DAO.DensityDAO;
import com.seoul.guide.density.DTO.DensityDTO;

//DensityServiceImpl
@Service
public class DensityServiceImpl implements DensityService {
    @Autowired
    DensityDAO densityDAO;

    private static final List<String> ORDERED_DENSE_LVL = Arrays.asList("여유", "보통", "약간 붐빔", "붐빔");

    
    @Override
    public List<DensityDTO> selectAllDensity() throws Exception {
        return densityDAO.selectAllDensity();
    }

    @Override
    public void updateDensity(DensityDTO densityDTO) throws Exception {
        densityDAO.updateDensity(densityDTO);
    }

    //혼잡도순 정렬을 위한 역순정렬 코드 
    @Override
    public List<DensityDTO> selectAllDensityOrderByDenseLvl() throws Exception {
        return densityDAO.selectAllDensity()
            .stream()
            .sorted((d1, d2) -> ORDERED_DENSE_LVL.indexOf(d2.getDense_lvl()) - ORDERED_DENSE_LVL.indexOf(d1.getDense_lvl())) // 순서 반전
            .collect(Collectors.toList());
    }






    @Override
    public List<DensityDTO> selectAllDensityOrderByName() throws Exception {
        return densityDAO.selectAllDensityOrderByName();
    }

    @Override
    public List<DensityDTO> selectAllDensityUnsorted() throws Exception {
        return densityDAO.selectAllDensityUnsorted(); // 추가
    }
}
