package com.spring.boot.SpringBootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerSimple {

	@RequestMapping("/hello")
	public String test() {
		return "Spring testaa"; 
	}
}
