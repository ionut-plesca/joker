package com.ionut.joker;

import com.ionut.joker.service.JokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokerApplication.class, args);
		extract();
	}

	private static void extract(){
		JokerService jokerService = new JokerService();
		jokerService.extractNumbers();
		jokerService.extractJoker();
	}

}
