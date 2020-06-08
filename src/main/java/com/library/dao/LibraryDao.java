package com.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.LibraryModel;

@Repository
public interface LibraryDao extends JpaRepository<LibraryModel, Integer> {

}
