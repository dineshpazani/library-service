package com.library.serviceTests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.library.dao.LibraryDao;
import com.library.model.BooksModel;
import com.library.model.LibraryModel;
import com.library.serviceimpl.LibraryServiceImpl;

@ExtendWith(MockitoExtension.class)
public class LibraryServuceTest {
	
	@InjectMocks
	private LibraryServiceImpl libraryService;

	@Mock
	private LibraryDao libraryDao;
	
	private List<LibraryModel> libraryModelList;
	

	@Test
	public void getAllDetailsTest() {
		
		BooksModel booksModel = new BooksModel();
		booksModel.setBookId("Lets C");
		booksModel.setAuthorName("Good Author");
		booksModel.setBookId("100");
		booksModel.setQuantity(1000);
		
		libraryModelList = new ArrayList<>();
		LibraryModel libraryModel= new LibraryModel();
		libraryModel.setUsername("Test user");
		libraryModel.setIssuedBooks(booksModel);
		libraryModel.setIssueddate(new Date(1));
		
		libraryModelList.add(libraryModel);
		
		when(libraryDao.findAll()).thenReturn(libraryModelList);

		List<LibraryModel> libraryModelList = libraryService.getAllDetails();

		assertEquals(libraryModelList.size(), libraryModelList.size());

	}
	
	
	
	@Test
	public void addIssuedBookTest() {
		
		BooksModel booksModel = new BooksModel();
		booksModel.setBookId("Lets C");
		booksModel.setAuthorName("Good Author");
		booksModel.setBookId("100");
		booksModel.setQuantity(1000);
		
		libraryModelList = new ArrayList<>();
		LibraryModel libraryModel= new LibraryModel();
		libraryModel.setUsername("Test user");
		libraryModel.setIssuedBooks(booksModel);
		libraryModel.setIssueddate(new Date(1));
		
		libraryModelList.add(libraryModel);
		
		when(libraryDao.save(libraryModelList.get(0))).thenReturn(libraryModelList.get(0));

		LibraryModel expectedModel = libraryService.addIssuedBook(libraryModelList.get(0));

		assertEquals(expectedModel.getUsername(), libraryModelList.get(0).getUsername());
	}

}
