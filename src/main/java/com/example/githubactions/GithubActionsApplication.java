package com.example.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

	@GetMapping("/hello")
	public String getMessage(){
		return "hello world";
	}
}
