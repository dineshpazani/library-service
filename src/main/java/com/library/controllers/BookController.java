package com.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.BooksModel;
import com.library.service.BookService;

@RestController
@RequestMapping("/v1/book")
@CrossOrigin(origins = "*")
public class BookController {
	
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<BooksModel> getString() {
		return bookService.getAllBook();
	}
	
	@PostMapping(value = "/addbook", consumes = "application/json", produces = "application/json")
	public BooksModel addBook(@RequestBody BooksModel booksModel) {
		return bookService.addBook(booksModel);
		
	}
	
}
