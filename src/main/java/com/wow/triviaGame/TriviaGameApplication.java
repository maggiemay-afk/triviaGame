package com.wow.triviaGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TriviaGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriviaGameApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

		return String.format("Hello %s!", name);
	}

	@GetMapping("/goodbye")
	public String goodbye(@RequestParam(value = "name", defaultValue = "World") String name) {

		return String.format("Goodbye %s!", name);
	}
}
