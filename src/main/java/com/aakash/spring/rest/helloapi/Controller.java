package com.aakash.spring.rest.helloapi;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/hello/{name}")
	public String getMessage(@PathVariable("name") String name) {
		return "hello " + name;
	}
	
}
