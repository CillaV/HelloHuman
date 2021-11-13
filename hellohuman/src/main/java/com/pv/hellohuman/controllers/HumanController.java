package com.pv.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

//	@RequestMapping("/")
//	public String hello(@RequestParam(value = "q", required=false, defaultValue = "Human") String humanName ) {
//		return "Hello " + humanName + "!";
//	}
//	
	
	// ninja bonus -- including last name as parameter
	
//	@RequestMapping("/")
//	public String helloFullName(@RequestParam(value = "a",required=false, defaultValue = "Human") String firstName,
//		@RequestParam(value = "b", required=false, defaultValue= "Human" ) String lastName) {
//		return String.format("Hello %s %s! ", firstName, lastName);
//	}
	
	
	// sensei bonus -- add times parameter -- .repeat(int)
	
	@RequestMapping("/")
	public String helloFullName(@RequestParam(value = "a",required=false, defaultValue = "Human") String firstName,
		@RequestParam(value = "b", required=false, defaultValue= "Human" ) String lastName) {
		return String.format("Hello %s %s! ", firstName, lastName).repeat(5);
	}
	
}
