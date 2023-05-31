package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SeoulRtd.citydata")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityDataResponse {
    
	@XmlElement(name = "list_total_count")
    private int listTotalCount;

//    @XmlElement(name = "RESULT")
//    private Result result;

    @XmlElement(name = "CITYDATA")
    private CityData cityData;

    // getter, setter ...
    public int getListTotalCount() {
		return listTotalCount;
	}

	public void setListTotalCount(int listTotalCount) {
		this.listTotalCount = listTotalCount;
	}

	public CityData getCityData() {
		return cityData;
	}

	public void setCityData(CityData cityData) {
		this.cityData = cityData;
	}

    
}
