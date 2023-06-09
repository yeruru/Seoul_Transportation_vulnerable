package com.seoul.guide.comment.DTO;

import java.util.Date;

public class CommentDTO {
	private Integer comment_id;
	private String member_email;
	private Integer tourist_id;
	private String comment_content;
	
	private String nickname;
	private String name;
	private Date t_comment_reg;
	
	
	
	public CommentDTO() {}
	public CommentDTO(String member_email, Integer tourist_id, String comment_content, String nickname, String name) {
		this.member_email = member_email;
		this.tourist_id = tourist_id;
		this.comment_content = comment_content;
		this.nickname = nickname;
		this.name = name;
	}
	
	
	
	public Integer getComment_id() {
		return comment_id;
	}
	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public Integer getTourist_id() {
		return tourist_id;
	}
	public void setTourist_id(Integer tourist_id) {
		this.tourist_id = tourist_id;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getT_comment_reg() {
		return t_comment_reg;
	}
	public void setT_comment_reg(Date t_comment_reg) {
		this.t_comment_reg = t_comment_reg;
	}
	
	
	
	
}
