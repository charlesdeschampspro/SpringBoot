package com.example.synonym.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "MY_WORD")
@Data
public class MyWord {

	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "WORD")
	private String word;

}
