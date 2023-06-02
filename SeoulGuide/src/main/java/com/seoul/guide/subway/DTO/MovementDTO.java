// DTO
package com.seoul.guide.subway.DTO;

public class MovementDTO {
    private Integer mvPathMgNo; // 이동 경로 관리 번호
    private Integer exitMvTpOrdr; // 순서
    private String mvContDtl; // 상세 이동 내용
    private String stMovePath; // 시작지
    private String edMovePath; // 도착지
    private String imgPath; // 이미지 경로
    private String elvtTpCd; // 승강기 유형 코드
    private String elvtSttCd; // 승강기 상태 코드
    
    
    
    public MovementDTO() {}

    public MovementDTO(Integer mvPathMgNo, Integer exitMvTpOrdr, String mvContDtl, String stMovePath, String edMovePath,
            String imgPath, String elvtTpCd, String elvtSttCd) {
        this.mvPathMgNo = mvPathMgNo;
        this.exitMvTpOrdr = exitMvTpOrdr;
        this.mvContDtl = mvContDtl;
        this.stMovePath = stMovePath;
        this.edMovePath = edMovePath;
        this.imgPath = imgPath;
        this.elvtTpCd = elvtTpCd;
        this.elvtSttCd = elvtSttCd;
    }

    public Integer getMvPathMgNo() {
        return mvPathMgNo;
    }

    public void setMvPathMgNo(Integer mvPathMgNo) {
        this.mvPathMgNo = mvPathMgNo;
    }

    public Integer getExitMvTpOrdr() {
        return exitMvTpOrdr;
    }

    public void setExitMvTpOrdr(Integer exitMvTpOrdr) {
        this.exitMvTpOrdr = exitMvTpOrdr;
    }

    public String getMvContDtl() {
        return mvContDtl;
    }

    public void setMvContDtl(String mvContDtl) {
        this.mvContDtl = mvContDtl;
    }

    public String getStMovePath() {
        return stMovePath;
    }

    public void setStMovePath(String stMovePath) {
        this.stMovePath = stMovePath;
    }

    public String getEdMovePath() {
        return edMovePath;
    }

    public void setEdMovePath(String edMovePath) {
        this.edMovePath = edMovePath;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getElvtTpCd() {
        return elvtTpCd;
    }

    public void setElvtTpCd(String elvtTpCd) {
        this.elvtTpCd = elvtTpCd;
    }

    public String getElvtSttCd() {
        return elvtSttCd;
    }

    public void setElvtSttCd(String elvtSttCd) {
        this.elvtSttCd = elvtSttCd;
    }

    @Override
    public String toString() {
        return "MovementDTO [mvPathMgNo=" + mvPathMgNo + ", exitMvTpOrdr=" + exitMvTpOrdr + ", mvContDtl=" + mvContDtl
                + ", stMovePath=" + stMovePath + ", edMovePath=" + edMovePath + ", imgPath=" + imgPath + ", elvtTpCd="
                + elvtTpCd + ", elvtSttCd=" + elvtSttCd + "]";
    }
}
