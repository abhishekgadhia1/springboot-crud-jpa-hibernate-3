package com.practice.SpringBootSixth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.SpringBootSixth.dao.UserRepository;
import com.practice.SpringBootSixth.entities.User;

@SpringBootApplication
public class SpringBootSixthApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootSixthApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Abhishek");
		user.setCity("Ahmedabad");
		user.setStatus("Java coder");
		
		User user1 = userRepo.save(user);
		System.out.println(user1);
	}

}
