package com.seoul.guide.member.DTO;

public class MemberDTO {
	
	private Integer userId;
	private String nickname;
	private String username;
	private String email;
	private String password;
	private Integer phone1;
	private Integer phone2;
	private Integer phone3;
	private String birthday;
	
	//fileVO
	private String name;
	private String directory;
	
	public MemberDTO() {}
	
	public MemberDTO(Integer userId, String nickname, String username, String email, String password, Integer phone1,
			Integer phone2, Integer phone3, String birthday, String name, String directory) {
		this.userId = userId;
		this.nickname = nickname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.birthday = birthday;
		this.name = name;
		this.directory = directory;
	}


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", nickname=" + nickname + ", username=" + username + ", email=" + email
				+ ", password=" + password + ", phone1=" + phone1 + ", phone2=" + phone2 + ", phone3=" + phone3
				+ ", birthday=" + birthday + "]";
	}
	
	

}
