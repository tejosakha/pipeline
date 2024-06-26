package com.pipeline.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getUserName(){
		return "welcome to jenkins tejo";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
