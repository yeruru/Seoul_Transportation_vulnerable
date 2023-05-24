package com.seoul.guide.DTO;

public class MemberDTO {

	private Integer num;
	private String id;
	private String password;
	private String email;
	private String address;
	
	public MemberDTO(){}
	public MemberDTO(Integer num, String id, String password, String email, String address) {
		this.num = num;
		this.id = id;
		this.password = password;
		this.email = email;
		this.address = address;
	}
	
	public MemberDTO(String id, String password, String email, String address) {
		this.id = id;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
