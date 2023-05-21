package com.spring.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//localhost 9090 /restful
@RestController
@RequestMapping("/main")
//localhost 9090 /restful/main
public class MainController {

	//localhost 9090 /restful/main/facebook
	@GetMapping("/facebook")
	public String gerMain() {
		return "Hi Gemy";
	}
	
	
}
