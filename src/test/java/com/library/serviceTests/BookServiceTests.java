package com.library.serviceTests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.library.dao.BookDao;
import com.library.model.BooksModel;
import com.library.serviceimpl.BookServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BookServiceTests {

	@InjectMocks
	private BookServiceImpl bookService;

	@Mock
	private BookDao bookDao;
	
	private List<BooksModel> bookList;
	

	@Test
	public void getAllBookTest() {
		
		bookList = new ArrayList<>();
		BooksModel booksModel = new BooksModel();
		booksModel.setBookId("Lets C");
		booksModel.setAuthorName("Good Author");
		booksModel.setBookId("100");
		booksModel.setQuantity(1000);
		bookList.add(booksModel);
		
		when(bookDao.findAll()).thenReturn(bookList);

		List<BooksModel> actualBookList = bookService.getAllBook();

		assertEquals(actualBookList.size(), bookList.size());

	}
	
	@Test
	public void addBookTest() {
		
		bookList = new ArrayList<>();
		BooksModel booksModel = new BooksModel();
		booksModel.setBookId("Lets C");
		booksModel.setAuthorName("Good Author");
		booksModel.setBookId("100");
		booksModel.setQuantity(1000);
		bookList.add(booksModel);
		
		when(bookDao.save(bookList.get(0))).thenReturn(bookList.get(0));

		BooksModel expectedBooksModel = bookService.addBook(bookList.get(0));

		assertEquals(expectedBooksModel.getAuthorName(), bookList.get(0).getAuthorName());
	}

}
