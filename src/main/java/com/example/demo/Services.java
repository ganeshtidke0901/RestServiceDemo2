package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services {
	/**
	 * This service method would be connecting COM ports and retrieving the data and sending back to client as per requested commands
	 * @param s
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/serialport/fetch")
	public String helloWorld(@RequestBody String commands) {
		return "Hello "+commands;
	}
}	
