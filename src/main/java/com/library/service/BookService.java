package com.library.service;

import java.util.List;

import com.library.model.BooksModel;

public interface BookService {
	
	List<BooksModel> getAllBook();
	
	BooksModel addBook(BooksModel bookModel);
	
	

}
