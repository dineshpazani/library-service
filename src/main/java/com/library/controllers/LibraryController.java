package com.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.LibraryModel;
import com.library.service.LibraryService;

@RestController
@RequestMapping("/v1/library")
@CrossOrigin(origins = "*")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<LibraryModel> getString() {
		return libraryService.getAllDetails();
	}

	@PostMapping(value = "/addissuedbook", consumes = "application/json", produces = "application/json")
	public LibraryModel addIssuedBook(@RequestBody LibraryModel libraryModel) {
		return libraryService.addIssuedBook(libraryModel);
	}

}
