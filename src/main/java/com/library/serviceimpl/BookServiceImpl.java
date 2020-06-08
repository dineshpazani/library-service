package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.dao.BookDao;
import com.library.model.BooksModel;
import com.library.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	@Override
	public List<BooksModel> getAllBook() {
		return bookDao.findAll();
	}

	@Override
	public BooksModel addBook(BooksModel bookModel) {
		return bookDao.save(bookModel);
	}

	
	

}
