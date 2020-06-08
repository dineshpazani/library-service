package com.library.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "LIBRARY")
public class LibraryModel {

    @Id 
	@Column(name = "username", length = 64, nullable = false)
	private String username;

	@Column(name = "issueddate", nullable = false)
	private Date issueddate;

	@ManyToOne
	private BooksModel issuedBooks;

}
