package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OuterLivePopulationStatus {
	
		

		@XmlElement(name = "LIVE_PPLTN_STTS")
	    private InnerLivePopulationStatus innerLivePopulationStatus;



    // getter, setter ...
		public InnerLivePopulationStatus getInnerLivePopulationStatus() {
			return innerLivePopulationStatus;
		}

		public void setInnerLivePopulationStatus(InnerLivePopulationStatus innerLivePopulationStatus) {
			this.innerLivePopulationStatus = innerLivePopulationStatus;
		}
    
}
