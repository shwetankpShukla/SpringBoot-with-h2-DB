package com.tagit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tagit.model.User;
import com.tagit.repositry.UserRepositry;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class InMemoryDbApplication implements CommandLineRunner {

	private UserRepositry repositry;

	@Autowired
	public InMemoryDbApplication(UserRepositry repositry) {
		this.repositry = repositry;
	}

	public static void main(String[] args) {
		SpringApplication.run(InMemoryDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(1L, "Fisrt User", 18);
		User user2 = new User(2L, "Ivan", 26);
		User user3 = new User(3L, "Adam", 31);

		log.info("Inserting data in DB.");
		repositry.save(user1);
		repositry.save(user2);
		repositry.save(user3);
		
		 log.info("User count in DB: {}", repositry.count());
		 log.info("User with ID 1: {}", repositry.findById(1L));
	     log.info("Deleting user with ID 2L form DB.");
	     repositry.deleteById(2L);
	     log.info("User count in DB: {}", repositry.count());
	}

}
