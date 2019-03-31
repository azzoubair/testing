package com.cgi.fic.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OpensTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpensTestApplication.class, args);
	}
	
}
@RestController
class homeController{
	@GetMapping("/")
	public String test() {
		return "hello world";
	}
}