package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	
	@GetMapping("/")
	public String hello()
	{
		return "welcome to jenkins";
	}
	
	@GetMapping("/first")
	public String first()
	{
		return "first service hai war vamsi from git pushing";
	}
	
	
	
}
