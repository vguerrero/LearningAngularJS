package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/home")
public class HomeController {

	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public String index() {
		return "greetings from remote controller";
	}

}