package com.seoul.guide.member.DTO;

public class MemberDTO {
	
	private String nickname;
	private String username;
	private String email;
	private String password;
	private String phoneNumber;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	

}
