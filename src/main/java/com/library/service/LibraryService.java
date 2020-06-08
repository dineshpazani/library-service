package com.library.service;

import java.util.List;

import com.library.model.LibraryModel;

public interface LibraryService {
	
	List<LibraryModel> getAllDetails();
	
	
	LibraryModel addIssuedBook(LibraryModel libraryModel);
	
	

}
