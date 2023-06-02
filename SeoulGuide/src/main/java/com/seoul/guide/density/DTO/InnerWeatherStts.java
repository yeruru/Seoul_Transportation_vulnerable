package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class InnerWeatherStts {
	
	@XmlElement(name = "WEATHER_TIME")
    private String weatherTime;

    @XmlElement(name = "TEMP")
    private double temperature;

    @XmlElement(name = "SENSIBLE_TEMP")
    private double sensibleTemperature;

    @XmlElement(name = "MAX_TEMP")
    private double maxTemperature;

    @XmlElement(name = "MIN_TEMP")
    private double minTemperature;

    @XmlElement(name = "HUMIDITY")
    private int humidity;

    @XmlElement(name = "WIND_DIRCT")
    private String windDirection;

    @XmlElement(name = "WIND_SPD")
    private double windSpeed;

    @XmlElement(name = "PRECIPITATION")
    private String precipitation;

    @XmlElement(name = "PRECPT_TYPE")
    private String precipitationType;

    @XmlElement(name = "PCP_MSG")
    private String precipitationMsg;

    @XmlElement(name = "SUNRISE")
    private String sunrise;

    @XmlElement(name = "SUNSET")
    private String sunset;

    @XmlElement(name = "UV_INDEX_LVL")
    private int uvIndexLevel;

    @XmlElement(name = "UV_INDEX")
    private String uvIndex;

    @XmlElement(name = "UV_MSG")
    private String uvMsg;

    @XmlElement(name = "PM25_INDEX")
    private String pm25Index;

    @XmlElement(name = "PM25")
    private int pm25;

    @XmlElement(name = "PM10_INDEX")
    private String pm10Index;

    @XmlElement(name = "PM10")
    private int pm10;

    @XmlElement(name = "AIR_IDX")
    private String airIndex;

    @XmlElement(name = "AIR_IDX_MVL")
    private double airIndexMvl;

    @XmlElement(name = "AIR_IDX_MAIN")
    private String airIndexMain;

    @XmlElement(name = "AIR_MSG")
    private String airMsg;

//    @XmlElementWrapper(name = "FCST24HOURS")
//    @XmlElement(name = "FCST24HOURS")
//    private List<Forecast> forecast;

    // getters and setters
    public String getWeatherTime() {
		return weatherTime;
	}

	public void setWeatherTime(String weatherTime) {
		this.weatherTime = weatherTime;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getSensibleTemperature() {
		return sensibleTemperature;
	}

	public void setSensibleTemperature(double sensibleTemperature) {
		this.sensibleTemperature = sensibleTemperature;
	}

	public double getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public double getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(double minTemperature) {
		this.minTemperature = minTemperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
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

	public String getPrecipitationMsg() {
		return precipitationMsg;
	}

	public void setPrecipitationMsg(String precipitationMsg) {
		this.precipitationMsg = precipitationMsg;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public int getUvIndexLevel() {
		return uvIndexLevel;
	}

	public void setUvIndexLevel(int uvIndexLevel) {
		this.uvIndexLevel = uvIndexLevel;
	}

	public String getUvIndex() {
		return uvIndex;
	}

	public void setUvIndex(String uvIndex) {
		this.uvIndex = uvIndex;
	}

	public String getUvMsg() {
		return uvMsg;
	}

	public void setUvMsg(String uvMsg) {
		this.uvMsg = uvMsg;
	}

	public String getPm25Index() {
		return pm25Index;
	}

	public void setPm25Index(String pm25Index) {
		this.pm25Index = pm25Index;
	}

	public int getPm25() {
		return pm25;
	}

	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}

	public String getPm10Index() {
		return pm10Index;
	}

	public void setPm10Index(String pm10Index) {
		this.pm10Index = pm10Index;
	}

	public int getPm10() {
		return pm10;
	}

	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}

	public String getAirIndex() {
		return airIndex;
	}

	public void setAirIndex(String airIndex) {
		this.airIndex = airIndex;
	}

	public double getAirIndexMvl() {
		return airIndexMvl;
	}

	public void setAirIndexMvl(double airIndexMvl) {
		this.airIndexMvl = airIndexMvl;
	}

	public String getAirIndexMain() {
		return airIndexMain;
	}

	public void setAirIndexMain(String airIndexMain) {
		this.airIndexMain = airIndexMain;
	}

	public String getAirMsg() {
		return airMsg;
	}

	public void setAirMsg(String airMsg) {
		this.airMsg = airMsg;
	}

//	public List<Forecast> getForecast() {
//		return forecast;
//	}
//
//	public void setForecast(List<Forecast> forecast) {
//		this.forecast = forecast;
//	}
}

