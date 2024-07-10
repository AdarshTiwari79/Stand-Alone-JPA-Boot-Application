package com.boot.standAlone;

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
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
	}

}
