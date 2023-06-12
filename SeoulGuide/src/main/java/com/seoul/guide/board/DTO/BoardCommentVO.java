package com.seoul.guide.board.DTO;

import java.util.Date;

public class BoardCommentVO {
	private Integer comment_id;
	private Integer post_id;
	private Integer user_id;
	private String comment_content;
	private String nickname;
	private Date b_comment_reg;
	private Date b_comment_chg;
	private String name;
	
	public BoardCommentVO () {}

	public BoardCommentVO(Integer comment_id, Integer post_id, Integer user_id, String comment_content, String nickname,
			Date b_comment_reg, Date b_comment_chg, String name) {
		this.comment_id = comment_id;
		this.post_id = post_id;
		this.user_id = user_id;
		this.comment_content = comment_content;
		this.nickname = nickname;
		this.b_comment_reg = b_comment_reg;
		this.b_comment_chg = b_comment_chg;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getComment_id() {
		return comment_id;
	}

	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}

	public Integer getPost_id() {
		return post_id;
	}

	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
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

	public Date getB_comment_reg() {
		return b_comment_reg;
	}

	public void setB_comment_reg(Date b_comment_reg) {
		this.b_comment_reg = b_comment_reg;
	}

	public Date getB_comment_chg() {
		return b_comment_chg;
	}

	public void setB_comment_chg(Date b_comment_chg) {
		this.b_comment_chg = b_comment_chg;
	}

	@Override
	public String toString() {
		return "BoardCommentVO [comment_id=" + comment_id + ", post_id=" + post_id + ", user_id=" + user_id
				+ ", comment_content=" + comment_content + ", nickname=" + nickname + ", b_comment_reg=" + b_comment_reg
				+ ", b_comment_chg=" + b_comment_chg + ", name=" + name + "]";
	}

	
	
	
	
}
//CREATE TABLE board_comment (
//		comment_id	INT	primary key AUTO_INCREMENT NOT NULL, #PK
//		post_id	INT	NOT NULL, #FK
//		user_id	INT	NOT NULL, #FK -- 작성자
//		comment_content	varchar(255)	NOT NULL,
//		b_comment_reg	DATETIME  DEFAULT NOW()	NOT NULL,
//		b_comment_chg	DATETIME DEFAULT NOW()	 NULL
//	);