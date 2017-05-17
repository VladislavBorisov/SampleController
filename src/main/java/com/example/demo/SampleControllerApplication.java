package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
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