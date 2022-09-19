package com.example.synonym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.synonym.dao.MySynonymDao;
import com.example.synonym.dao.MyWordDao;
import com.example.synonym.entity.MySynonym;
import com.example.synonym.entity.MyWord;

@Component
public class DataInit implements ApplicationRunner {

	@Autowired
	MyWordDao myWordDao;

	@Autowired
	MySynonymDao mySynonymDao;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		InitMyWord();
		InitMySynonym();

	}

	/**
	 * Init my_word table
	 */
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

	/**
	 * Init my_synonym table
	 */
	private void InitMySynonym() {
		List<MySynonym> listAllSynonyms = new ArrayList<>();

		List<String> listSynonymEat = Arrays.asList("ingérer", "consommer", "dévorer", "avaler", "absorber",
				"grignoter", "ingurgiter", "boulotter", "bouffer", "becqueter", "croûter", "briffer", "souper",
				"brouter", "paître", "pâturer", "picorer", "consumer", "dévorer", "engloutir");

		List<String> listSynonymRun = Arrays.asList("dépêcher", "précipiter", "voler", "galoper", "tracer", "filer",
				"décamper", "trotter", "détaler", "cavaler", "sillonner", "sprinter");

		List<String> listSynonymSleep = Arrays.asList("sommeiller", "somnoler", "roupiller", "pioncer");

		mapperSynonym(1L, listSynonymEat, listAllSynonyms);
		mapperSynonym(2L, listSynonymRun, listAllSynonyms);
		mapperSynonym(3L, listSynonymSleep, listAllSynonyms);

		mySynonymDao.saveAll(listAllSynonyms);

	}

	/**
	 * Map to my_synonym entity by dereferenced list
	 * 
	 * @param id
	 * @param listSynonym
	 * @param listAllSynonyms
	 */
	private void mapperSynonym(Long id, List<String> listSynonym, List<MySynonym> listAllSynonyms) {

		for (String synonym : listSynonym) {
			listAllSynonyms.add(new MySynonym(id, synonym));
		}
	}
}
