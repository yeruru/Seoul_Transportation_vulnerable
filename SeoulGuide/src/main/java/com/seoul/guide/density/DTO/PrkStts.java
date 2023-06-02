package com.seoul.guide.density.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PrkStts {

	@XmlElement(name = "PRK_NM")
    private String prkNm;
    
    @XmlElement(name = "PRK_CD")
    private String prkCd;

    @XmlElement(name = "CPCTY")
    private int cpcty;

    @XmlElement(name = "CUR_PRK_CNT")
    private int curPrkCnt;

    @XmlElement(name = "CUR_PRK_TIME")
    private String curPrkTime;

    @XmlElement(name = "CUR_PRK_YN")
    private String curPrkYn;

    @XmlElement(name = "PAY_YN")
    private String payYn;

    @XmlElement(name = "RATES")
    private int rates;

    @XmlElement(name = "TIME_RATES")
    private int timeRates;

    @XmlElement(name = "ADD_RATES")
    private int addRates;

    @XmlElement(name = "ADD_TIME_RATES")
    private int addTimeRates;

    @XmlElement(name = "ADDRESS")
    private String address;

    @XmlElement(name = "LNG")
    private double lng;

    @XmlElement(name = "LAT")
    private double lat;

    // Getter and Setter methods...
    
    public String getPrkNm() {
		return prkNm;
	}

	public void setPrkNm(String prkNm) {
		this.prkNm = prkNm;
	}

	public String getPrkCd() {
		return prkCd;
	}

	public void setPrkCd(String prkCd) {
		this.prkCd = prkCd;
	}

	public int getCpcty() {
		return cpcty;
	}

	public void setCpcty(int cpcty) {
		this.cpcty = cpcty;
	}

	public int getCurPrkCnt() {
		return curPrkCnt;
	}

	public void setCurPrkCnt(int curPrkCnt) {
		this.curPrkCnt = curPrkCnt;
	}

	public String getCurPrkTime() {
		return curPrkTime;
	}

	public void setCurPrkTime(String curPrkTime) {
		this.curPrkTime = curPrkTime;
	}

	public String getCurPrkYn() {
		return curPrkYn;
	}

	public void setCurPrkYn(String curPrkYn) {
		this.curPrkYn = curPrkYn;
	}

	public String getPayYn() {
		return payYn;
	}

	public void setPayYn(String payYn) {
		this.payYn = payYn;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

	public int getTimeRates() {
		return timeRates;
	}

	public void setTimeRates(int timeRates) {
		this.timeRates = timeRates;
	}

	public int getAddRates() {
		return addRates;
	}

	public void setAddRates(int addRates) {
		this.addRates = addRates;
	}

	public int getAddTimeRates() {
		return addTimeRates;
	}

	public void setAddTimeRates(int addTimeRates) {
		this.addTimeRates = addTimeRates;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	
    
}
