package com.seoul.guide.bookmark.Service;

import com.seoul.guide.bookmark.DTO.bookmarkDTO;

public interface bookmarkService {
	public void insertbookmark(bookmarkDTO bookmark) throws Exception;
	public Integer selectbookmark(bookmarkDTO bookmark) throws Exception;
	public void deletebookmark(bookmarkDTO bookmark) throws Exception;
}
