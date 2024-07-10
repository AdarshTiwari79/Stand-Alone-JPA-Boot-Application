package com.boot.standAlone;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.standAlone.dao.UserRepository;
import com.boot.standAlone.entities.User;

@SpringBootApplication
public class StandAloneJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StandAloneJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Adarsh Tiwari");
		user.setCity("Jaunpur");
		user.setStatus("highly Motivated");
		
		/* inserting a single user */
		/*
		User user1 = userRepository.save(user);
		System.out.println(user1);
		*/
		
		User user2 = new User();
		user2.setName("Shivangi Modanwal");
		user2.setCity("Rampur");
		user2.setStatus("marries");
		
		/* Inserting multiple users */
		
		List<User> users = List.of(user,user2);
		Iterable<User> result = userRepository.saveAll(users);
		
		result.forEach(e->System.out.println(e));
		
		
		/* selecting a single user */
		/*
		Optional<User> optional = userRepository.findById(3);
		User forUpdate = optional.get();
		
		System.out.println(forUpdate);
		*/
		
		/* selecting multiple users */
		/*
		Iterable<User> itr = userRepository.findAll();
		itr.forEach(s->System.out.println(s));
		*/
		
		/* updating single user */
		/*
		Optional<User> optional = userRepository.findById(2);
		User forUpdate = optional.get();
		
		forUpdate.setName("Rajan Bhaiya");
		User afterUpdate = userRepository.save(forUpdate);
		
		System.out.println(afterUpdate);
		*/
		
		/* deleting single user */
		/*
		Optional<User> optional = userRepository.findById(2);
		User forDelete = optional.get();
		userRepository.delete(forDelete);
		System.out.println("deletion performed successfully.");
		// to check the list after deletion
		Iterable<User> itr = userRepository.findAll();
		itr.forEach(s->System.out.println(s));
		*/
		
		/* deleting multiple users */
		/*
		Iterable<User> itr = userRepository.findAll();
		userRepository.deleteAll(itr);
		System.out.println("All the rows of user_details table gets deleted.");
		*/
		
		
		
	}

}
