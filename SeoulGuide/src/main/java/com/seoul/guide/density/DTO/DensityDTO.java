package com.seoul.guide.density.DTO;

import java.io.Serializable;

public class DensityDTO implements Serializable {
    private String dens_name;
    private String dense_lvl;
    private String dense_msg;
    private String dense_img;
    
    // getters and setters
    public String getDens_name() {
		return dens_name;
	}
	public void setDens_name(String dens_name) {
		this.dens_name = dens_name;
	}
	public String getDense_lvl() {
		return dense_lvl;
	}
	public void setDense_lvl(String dense_lvl) {
		this.dense_lvl = dense_lvl;
	}
    public String getDense_msg() {
        return dense_msg;
    }
    public void setDense_msg(String dense_msg) {
        this.dense_msg = dense_msg;
    }
    public String getDense_img() {
        return dense_img;
    }
    public void setDense_img(String dense_img) {
        this.dense_img = dense_img;
    }
}
