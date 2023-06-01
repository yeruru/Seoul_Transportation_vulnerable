package com.seoul.guide.subway.DTO;

public class SubwayDTO {
	private String RAIL_OPR_ISTT_CD;
	private String RAIL_OPR_ISTT_NM;
	private String LN_CD;
	private String LN_NM;
	private String STIN_CD;
	private String STIN_NM;
	
	public SubwayDTO() {}

	public SubwayDTO(String rAIL_OPR_ISTT_CD, String rAIL_OPR_ISTT_NM, String lN_CD, String lN_NM, String sTIN_CD,
			String sTIN_NM) {
		RAIL_OPR_ISTT_CD = rAIL_OPR_ISTT_CD;
		RAIL_OPR_ISTT_NM = rAIL_OPR_ISTT_NM;
		LN_CD = lN_CD;
		LN_NM = lN_NM;
		STIN_CD = sTIN_CD;
		STIN_NM = sTIN_NM;
	}

	public String getRAIL_OPR_ISTT_CD() {
		return RAIL_OPR_ISTT_CD;
	}

	public void setRAIL_OPR_ISTT_CD(String rAIL_OPR_ISTT_CD) {
		RAIL_OPR_ISTT_CD = rAIL_OPR_ISTT_CD;
	}

	public String getRAIL_OPR_ISTT_NM() {
		return RAIL_OPR_ISTT_NM;
	}

	public void setRAIL_OPR_ISTT_NM(String rAIL_OPR_ISTT_NM) {
		RAIL_OPR_ISTT_NM = rAIL_OPR_ISTT_NM;
	}

	public String getLN_CD() {
		return LN_CD;
	}

	public void setLN_CD(String lN_CD) {
		LN_CD = lN_CD;
	}

	public String getLN_NM() {
		return LN_NM;
	}

	public void setLN_NM(String lN_NM) {
		LN_NM = lN_NM;
	}

	public String getSTIN_CD() {
		return STIN_CD;
	}

	public void setSTIN_CD(String sTIN_CD) {
		STIN_CD = sTIN_CD;
	}

	public String getSTIN_NM() {
		return STIN_NM;
	}

	public void setSTIN_NM(String sTIN_NM) {
		STIN_NM = sTIN_NM;
	}

	@Override
	public String toString() {
		return "SubwayDTO [RAIL_OPR_ISTT_CD=" + RAIL_OPR_ISTT_CD + ", RAIL_OPR_ISTT_NM=" + RAIL_OPR_ISTT_NM + ", LN_CD="
				+ LN_CD + ", LN_NM=" + LN_NM + ", STIN_CD=" + STIN_CD + ", STIN_NM=" + STIN_NM + "]";
	}
	
	
	
	
}
