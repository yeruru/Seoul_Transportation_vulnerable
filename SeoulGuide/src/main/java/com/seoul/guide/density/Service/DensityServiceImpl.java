// DensityServiceImpl.java
package com.seoul.guide.density.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.density.DAO.DensityDAO;
import com.seoul.guide.density.DTO.DensityDTO;

//DensityServiceImpl.java
@Service
public class DensityServiceImpl implements DensityService {
	@Autowired
	DensityDAO densityDAO;

	private static final List<String> ORDERED_DENSE_LVL = Arrays.asList("여유", "보통", "약간 붐빔", "붐빔");

	@Override
	public List<DensityDTO> selectAllDensity(int page, int rowsPerPage) throws Exception {
	    int offset = (page - 1) * rowsPerPage;
	    return densityDAO.selectAllDensityUnsorted(offset, rowsPerPage);
	}

	@Override
	public void updateDensity(DensityDTO densityDTO) throws Exception {
		densityDAO.updateDensity(densityDTO);
	}

	@Override
	public List<DensityDTO> selectAllDensityOrderByDenseLvl(int page, int rowsPerPage) throws Exception {
		int offset = (page - 1) * rowsPerPage;
		return densityDAO.selectAllDensityOrderByDenseLvl(offset, rowsPerPage).stream().sorted(
				(d1, d2) -> ORDERED_DENSE_LVL.indexOf(d2.getDense_lvl()) - ORDERED_DENSE_LVL.indexOf(d1.getDense_lvl()))
				.collect(Collectors.toList());
	}

	@Override
	public List<DensityDTO> selectAllDensityOrderByName(int page, int rowsPerPage) throws Exception {
		int offset = (page - 1) * rowsPerPage;
		return densityDAO.selectAllDensityOrderByName(offset, rowsPerPage);
	}

	@Override
	public List<DensityDTO> selectAllDensityUnsorted(int page, int rowsPerPage) throws Exception {
		int offset = (page - 1) * rowsPerPage;
		return densityDAO.selectAllDensityUnsorted(offset, rowsPerPage);
	}

	@Override
	public int getTotalDensityCount() throws Exception {
		return densityDAO.getTotalDensityCount();
	}
	
	//페이지네이션용 추
	@Override
    public List<DensityDTO> selectAllDensityForUpdate() throws Exception {
        return densityDAO.selectAllDensityForUpdate();
    }
	

}
