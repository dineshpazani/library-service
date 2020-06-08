package com.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.BooksModel;

@Repository
public interface BookDao extends JpaRepository<BooksModel, Integer> {


}
