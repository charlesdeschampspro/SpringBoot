package com.example.synonym;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BodyResponse {

	private List<String> words;

	private Integer wordsNumber;

}
