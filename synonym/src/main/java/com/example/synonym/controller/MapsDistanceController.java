package com.example.synonym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapsDistanceController {

	/**
	 * Send all word in MY_WORD db
	 * @return
	 */
	@RequestMapping(value = "/word", method = RequestMethod.GET)
	@ResponseBody
	public String helloWorld(){
		return "test";
	}
}
