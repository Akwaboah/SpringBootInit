package com.ikanet.level1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Level1Application  implements ApplicationRunner, CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Level1Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(
				"ApplicationRunner 'run' lets you to execute the code after the Spring Boot application is started");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(
				"CommandLineRunner 'run' lets you to execute the code after the Spring Boot application is started");

	}

}
