package com.example.synonym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.synonym.BodyResponse;
import com.example.synonym.business.SynonymBusiness;

@Controller
public class SynonymController {

	@Autowired
	SynonymBusiness synonymBusiness;

	/**
	 * Send all word in MY_WORD db
	 * @return
	 */
	@RequestMapping(value = "/words", method = RequestMethod.GET)
	@ResponseBody
	public BodyResponse helloWorld() {
		return synonymBusiness.findAllWords();
	}
}
