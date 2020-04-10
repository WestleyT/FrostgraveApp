package com.westley.frostgraveapp.Frostgrave.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.westley.frostgraveapp.controllers"})
public class FrostgraveAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrostgraveAppApplication.class, args);
	}

}
