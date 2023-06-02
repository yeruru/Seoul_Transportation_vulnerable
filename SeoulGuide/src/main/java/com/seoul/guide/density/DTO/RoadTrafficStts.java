package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RoadTrafficStts {
	
		@XmlElement(name = "AVG_ROAD_DATA")
	    private AvgRoadData avgRoadData;

		public AvgRoadData getAvgRoadData() {
			return avgRoadData;
		}

		public void setAvgRoadData(AvgRoadData avgRoadData) {
			this.avgRoadData = avgRoadData;
		}
		
}
