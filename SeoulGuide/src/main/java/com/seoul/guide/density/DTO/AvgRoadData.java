package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AvgRoadData {

	@XmlElement(name = "ROAD_MSG")
	private String roadMsg;

	@XmlElement(name = "ROAD_TRAFFIC_IDX")
	private String roadTrafficIdx;

	@XmlElement(name = "ROAD_TRFFIC_TIME")
	private String roadTrafficTime;

	@XmlElement(name = "ROAD_TRAFFIC_SPD")
	private String roadTrafficSpd;

	public String getRoadMsg() {
		return roadMsg;
	}

	public void setRoadMsg(String roadMsg) {
		this.roadMsg = roadMsg;
	}

	public String getRoadTrafficIdx() {
		return roadTrafficIdx;
	}

	public void setRoadTrafficIdx(String roadTrafficIdx) {
		this.roadTrafficIdx = roadTrafficIdx;
	}

	public String getRoadTrafficTime() {
		return roadTrafficTime;
	}

	public void setRoadTrafficTime(String roadTrafficTime) {
		this.roadTrafficTime = roadTrafficTime;
	}

	public String getRoadTrafficSpd() {
		return roadTrafficSpd;
	}

	public void setRoadTrafficSpd(String roadTrafficSpd) {
		this.roadTrafficSpd = roadTrafficSpd;
	}

}
