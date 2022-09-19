package com.example.synonym.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "MY_SYNONYM")
@Data
public class MySynonym {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "id_word", nullable = false)
	private Long idWord;

	@Column(name = "SYNONYM")
	private String synonym;

	public MySynonym(Long id, String synonymm) {
		this.idWord = id;
		this.synonym = synonymm;
	}

}