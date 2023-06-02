package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Forecast {

	@XmlElement(name = "FCST_DT")
    private String forecastDate;

    @XmlElement(name = "TEMP")
    private int temperature;

    @XmlElement(name = "PRECIPITATION")
    private String precipitation;

    @XmlElement(name = "PRECPT_TYPE")
    private String precipitationType;

    @XmlElement(name = "RAIN_CHANCE")
    private int rainChance;

    @XmlElement(name = "SKY_STTS")
    private String skyStatus;

    // getters and setters

    public String getForecastDate() {
		return forecastDate;
	}

	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}

	public String getPrecipitationType() {
		return precipitationType;
	}

	public void setPrecipitationType(String precipitationType) {
		this.precipitationType = precipitationType;
	}

	public int getRainChance() {
		return rainChance;
	}

	public void setRainChance(int rainChance) {
		this.rainChance = rainChance;
	}

	public String getSkyStatus() {
		return skyStatus;
	}

	public void setSkyStatus(String skyStatus) {
		this.skyStatus = skyStatus;
	}

	    
}
