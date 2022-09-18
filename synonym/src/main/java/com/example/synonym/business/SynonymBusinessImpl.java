package com.example.synonym.business;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.synonym.BodyResponse;
import com.example.synonym.dao.MyWordDao;
import com.example.synonym.entity.MyWord;

@Component
public class SynonymBusinessImpl implements SynonymBusiness {

	@Autowired
	MyWordDao myWordDao;

	/**
	 * Get all words in MY_WORD db
	 */
	@Override
	public BodyResponse findAllWords() {
		

		List<MyWord> listWords = myWordDao.findAll();

		List<String> listWordsStr = listWords.stream().map(MyWord::getWord).collect(Collectors.toList());

		BodyResponse br = new BodyResponse(listWordsStr, listWordsStr.size());
		return br;
	}

}
