package com.seoul.guide.bookmark.DAO;

import com.seoul.guide.bookmark.DTO.bookmarkDTO;

public interface bookmarkDAO {
	public void insertbookmark(bookmarkDTO bookmark) throws Exception;
	public Integer selectbookmark(bookmarkDTO bookmark) throws Exception;
	public void deletebookmark(bookmarkDTO bookmark) throws Exception;
}
