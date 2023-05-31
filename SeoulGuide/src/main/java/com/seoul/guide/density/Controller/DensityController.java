package com.seoul.guide.density.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seoul.guide.density.DTO.DensityDTO;
import com.seoul.guide.density.Service.DensityService;

@Controller
public class DensityController {
    @Autowired
    DensityService densityService;

    @RequestMapping("/density")
    public String getDensityInfo(Model model) throws Exception {
        List<DensityDTO> densityList = densityService.selectAllDensity();
        model.addAttribute("densityList", densityList);
        return "density/density";
    }
    

}
