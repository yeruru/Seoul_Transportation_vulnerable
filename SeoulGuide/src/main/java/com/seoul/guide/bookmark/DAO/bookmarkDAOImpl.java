package com.seoul.guide.bookmark.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seoul.guide.bookmark.DTO.bookmarkDTO;
@Repository
public class bookmarkDAOImpl implements bookmarkDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	@Override
	public void insertbookmark(bookmarkDTO bookmark) throws Exception {
		sqlsession.insert("mapper.bookmark.insertbookmark", bookmark);
	}

	@Override
	public Integer selectbookmark(bookmarkDTO bookmark) throws Exception {
		return sqlsession.selectOne("mapper.bookmark.selectbookmark", bookmark);
	}

	@Override
	public void deletebookmark(bookmarkDTO bookmark) throws Exception {
		sqlsession.delete("mapper.bookmark.deletebookmark", bookmark);
	};
	
	
}
