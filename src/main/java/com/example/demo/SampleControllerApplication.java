package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleControllerApplication {

	@RequestMapping("/boot")
	@ResponseBody
	String home() {
		return "Hello Vladislav!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleControllerApplication.class, args);
	}
}