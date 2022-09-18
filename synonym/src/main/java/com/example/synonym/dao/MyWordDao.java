package com.example.synonym.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.synonym.entity.MyWord;

@Repository
public interface MyWordDao extends CrudRepository<MyWord, Long> {

	public List<MyWord> findAll();

}
