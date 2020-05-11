package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.Client;
import com.services.IServiceCall;

@RestController
public class HelloController {

	@Autowired IServiceCall serviceCall;
	
	@RequestMapping("/")
	public String index() {
		Client c = new Client();
		//c.set
		return "Greetings from Spring Boot! " + serviceCall.getNbaStars();
	}

}
