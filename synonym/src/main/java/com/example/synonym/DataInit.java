package com.example.synonym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.synonym.dao.MyWordDao;
import com.example.synonym.entity.MyWord;

@Component
public class DataInit implements ApplicationRunner {

	@Autowired
	MyWordDao myWordDao;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		InitMyWord();

	}

	private void InitMyWord() {
		MyWord myWord = new MyWord();
		myWord.setId(1L);
		myWord.setWord("manger");

		MyWord myWord2 = new MyWord();
		myWord2.setId(2L);
		myWord2.setWord("courir");

		MyWord myWord3 = new MyWord();
		myWord3.setId(3L);
		myWord3.setWord("dormir");

		myWordDao.save(myWord);
		myWordDao.save(myWord2);
		myWordDao.save(myWord3);
	}
}
