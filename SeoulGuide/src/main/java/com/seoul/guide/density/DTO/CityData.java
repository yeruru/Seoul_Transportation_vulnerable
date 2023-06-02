package com.seoul.guide.density.DTO;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class CityData {

	@XmlElement(name = "AREA_NM")
    private String areaName;

    @XmlElement(name = "LIVE_PPLTN_STTS")
    private OuterLivePopulationStatus outerLivePopulationStatus;

    @XmlElement(name = "ROAD_TRAFFIC_STTS")
    private RoadTrafficStts roadTrafficStts;
    
    @XmlElementWrapper(name = "PRK_STTS")
    @XmlElement(name = "PRK_STTS")
    private List<PrkStts> prkSttsList;
    
    // 날씨 xml 파싱 
    @XmlElement(name = "WEATHER_STTS")
    private OuterWeatherStts outerWeatherStts;
    
    public Integer getTotalCapacity() {
        Integer totalCapacity = 0;
        for (PrkStts parking : prkSttsList) {
            Integer capacity = parking.getCpcty();
            if (capacity != null) {
                totalCapacity += capacity;
            }
        }
        return totalCapacity;
    }

    public Integer getRemainingCapacity() {
        Integer remainingCapacity = 0;
        for (PrkStts parking : prkSttsList) {
            Integer currentCount = parking.getCurPrkCnt();
            if (currentCount != null) {
                remainingCapacity += currentCount;
            }
        }
        return remainingCapacity;
    }

    public double getRemainingRate() {
        Integer totalCapacity = getTotalCapacity();
        double remainingRate = (totalCapacity > 0) ? ((double)getRemainingCapacity() / totalCapacity) * 100 : 0;
        remainingRate = Math.round(remainingRate * 10.0) / 10.0;
        return remainingRate;
    }
    
    
    // ... 이하 다른 필드, getter, setter ...
    public OuterWeatherStts getOuterWeatherStts() {
        return outerWeatherStts;
    }

    public void setOuterWeatherStts(OuterWeatherStts outerWeatherStts) {
        this.outerWeatherStts = outerWeatherStts;
    }
    
    public List<PrkStts> getPrkSttsList() {
		return prkSttsList;
	}

	public void setPrkSttsList(List<PrkStts> prkSttsList) {
		this.prkSttsList = prkSttsList;
	}
	

    public RoadTrafficStts getRoadTrafficStts() {
		return roadTrafficStts;
	}

	public void setRoadTrafficStts(RoadTrafficStts roadTrafficStts) {
		this.roadTrafficStts = roadTrafficStts;
	}
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
