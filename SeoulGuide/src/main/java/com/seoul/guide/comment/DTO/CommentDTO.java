package com.seoul.guide.comment.DTO;

public class CommentDTO {
	private String member_email;
	private Integer tourist_id;
	private String comment_content;
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
	
}
