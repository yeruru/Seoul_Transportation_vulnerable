package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class CityData {
    

	@XmlElement(name = "AREA_NM")
    private String areaName;

    @XmlElement(name = "LIVE_PPLTN_STTS")
    private OuterLivePopulationStatus outerLivePopulationStatus;

    
    // ... 이하 다른 필드, getter, setter ...
    
    public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public OuterLivePopulationStatus getOuterLivePopulationStatus() {
		return outerLivePopulationStatus;
	}

	public void setOuterLivePopulationStatus(OuterLivePopulationStatus outerLivePopulationStatus) {
		this.outerLivePopulationStatus = outerLivePopulationStatus;
	}
}
