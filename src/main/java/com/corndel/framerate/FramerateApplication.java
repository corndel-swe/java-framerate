package com.corndel.framerate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.corndel.framerate.Models.Ligma;

@SpringBootApplication
public class FramerateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FramerateApplication.class, args);
		Ligma.doSomething();
	}
}
