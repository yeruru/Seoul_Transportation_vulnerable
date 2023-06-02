package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OuterWeatherStts {

	@XmlElement(name = "WEATHER_STTS")
    private InnerWeatherStts innerweatherStts;
	
	public InnerWeatherStts getInnerweatherStts() {
		return innerweatherStts;
	}

	public void setInnerweatherStts(InnerWeatherStts innerweatherStts) {
		this.innerweatherStts = innerweatherStts;
	}

}
