package com.seoul.guide.member.DTO;

public class MemberDTO {
	
	private String nickname;
	private String username;
	private String email;
	private String password;
	private Integer phone1;
	private Integer phone2;
	private Integer phone3;
	private String birthday;
	private Integer fileid;
	
	public Integer getFileid() {
		return fileid;
	}
	public void setFileid(Integer fileid) {
		this.fileid = fileid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getPhone1() {
		return phone1;
	}
	public void setPhone1(Integer phone1) {
		this.phone1 = phone1;
	}
	public Integer getPhone2() {
		return phone2;
	}
	public void setPhone2(Integer phone2) {
		this.phone2 = phone2;
	}
	public Integer getPhone3() {
		return phone3;
	}
	public void setPhone3(Integer phone3) {
		this.phone3 = phone3;
	}
	
	
	

}
