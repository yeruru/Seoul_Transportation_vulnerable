package com.seoul.guide.board.DTO;

import java.util.Date;

//Article
public class Article {
	private int post_id;
	private int user_id;
	private String post_title;
	private String post_content;
	private Date post_regdate;
	private Date post_edit_date;
	private int view_count; // 추가된 속성

	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_content() {
		return post_content;
	}
	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}
	public Date getPost_regdate() {
		return post_regdate;
	}
	public void setPost_regdate(Date post_regdate) {
		this.post_regdate = post_regdate;
	}
	public Date getPost_edit_date() {
		return post_edit_date;
	}
	public void setPost_edit_date(Date post_edit_date) {
		this.post_edit_date = post_edit_date;
	}
	public int getView_count() { // 조회수 getter
		return view_count;
	}
	public void setView_count(int view_count) { // 조회수 setter
		this.view_count = view_count;
	}
	
}
