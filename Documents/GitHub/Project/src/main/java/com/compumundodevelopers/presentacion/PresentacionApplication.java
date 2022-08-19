package com.compumundodevelopers.presentacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PresentacionApplication {
	@GetMapping("/home")
	public String home() {
		return "CompuMundo Developers";
	}

	public static void main(String[] args) {
		SpringApplication.run(PresentacionApplication.class, args);
	}

}
