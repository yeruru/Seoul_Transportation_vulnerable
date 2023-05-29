package com.seoul.guide.board.DTO;

public class Article {
	private Integer num;
	private String writer;
	private String title;
	private String content;
	private Integer fileid;

	public Article() {}
	
	public Article(Integer num,String writer,String title, String content) {
		this.num=num;
		this.writer=writer;
		this.title=title;
		this.content=content;
	}
	
	public Article(String writer,String title, String content) {
		this.writer=writer;
		this.title=title;
		this.content=content;
	}	
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Integer getFileid() {
		return fileid;
	}

	public void setFileid(Integer fileid) {
		this.fileid = fileid;
	}
}
