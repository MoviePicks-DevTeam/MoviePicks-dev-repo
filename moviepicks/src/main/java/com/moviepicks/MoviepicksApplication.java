package com.moviepicks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MoviepicksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviepicksApplication.class, args);
	}

	@GetMapping("/home")
	public void home() {
	}

}
