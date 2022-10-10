package com.cybage.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.cybage")
public class TutorialSpringMvcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialSpringMvcAppApplication.class, args);
	}

}
