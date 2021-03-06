package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired MessageRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		if(null == repo.findById(1L)) {
			Message message = new Message("Hallo World!");
			repo.save(message);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
