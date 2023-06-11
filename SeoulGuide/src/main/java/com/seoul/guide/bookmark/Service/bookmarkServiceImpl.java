package com.seoul.guide.bookmark.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.bookmark.DAO.bookmarkDAO;
import com.seoul.guide.bookmark.DTO.bookmarkDTO;
@Service
public class bookmarkServiceImpl implements bookmarkService {
	
	@Autowired
	private bookmarkDAO bookmarkDAO;

	@Override
	public void insertbookmark(bookmarkDTO bookmark) throws Exception {
		bookmarkDAO.insertbookmark(bookmark);
	}

	@Override
	public Integer selectbookmark(bookmarkDTO bookmark) throws Exception {
		return bookmarkDAO.selectbookmark(bookmark);
	}

	@Override
	public void deletebookmark(bookmarkDTO bookmark) throws Exception {
		bookmarkDAO.deletebookmark(bookmark);
	}

}
