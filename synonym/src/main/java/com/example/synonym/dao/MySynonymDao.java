package com.example.synonym.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.synonym.entity.MySynonym;

@Repository
public interface MySynonymDao extends CrudRepository<MySynonym, Long> {

//	public List<MySynonym> findAllById();

}
