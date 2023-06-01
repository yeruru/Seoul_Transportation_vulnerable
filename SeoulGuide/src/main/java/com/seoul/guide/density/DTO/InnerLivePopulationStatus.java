package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class InnerLivePopulationStatus {

	@XmlElement(name = "AREA_CONGEST_LVL")
    private String areaCongestLevel;

    @XmlElement(name = "AREA_CONGEST_MSG")
    private String areaCongestMessage;
	    
    // ... 이하 다른 필드, getter, setter ...
    public String getAreaCongestLevel() {
		return areaCongestLevel;
	}

	public void setAreaCongestLevel(String areaCongestLevel) {
		this.areaCongestLevel = areaCongestLevel;
	}

	public String getAreaCongestMessage() {
		return areaCongestMessage;
	}

	public void setAreaCongestMessage(String areaCongestMessage) {
		this.areaCongestMessage = areaCongestMessage;
	}
}
