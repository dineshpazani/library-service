package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.dao.LibraryDao;
import com.library.model.LibraryModel;
import com.library.service.LibraryService;


@Service	
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	private LibraryDao libraryDao;

	@Override
	public List<LibraryModel> getAllDetails() {
		return libraryDao.findAll();
	}

	@Override
	public LibraryModel addIssuedBook(LibraryModel libraryModel) {
		return libraryDao.save(libraryModel);
	}

	
	

}
