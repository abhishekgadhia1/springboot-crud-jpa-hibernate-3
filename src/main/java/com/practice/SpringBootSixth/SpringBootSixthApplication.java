package com.practice.SpringBootSixth;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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
		
//		User user = new User();
//		user.setName("Abhishek");
//		user.setCity("Ahmedabad");
//		user.setStatus("Java coder");
//		
//		User user1 = userRepo.save(user);
//		System.out.println(user1);
		
		User user1 = new User();
		user1.setName("ram");
		user1.setCity("abad");
		user1.setStatus("single");
		
		User user2 = new User();
		user2.setName("shyam");
		user2.setCity("rajkot");
		user2.setStatus("married");
		
//		User resultUser = userRepo.save(user2);
//		
//		System.out.println("saved user is "+resultUser);
//		System.out.println("done");
		
//		List<User> users = List.of(user1, user2);
//		Iterable<User> result = userRepo.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
//		System.out.println("done");
		
//		Optional<User> optional = userRepo.findById(102);
//	
//		User user = optional.get();
//		
//		user.setName("Abhishekkkkkk");
//		userRepo.save(user);
//		System.out.println(user);
		
//		Iterable<User> itr = userRepo.findAll();
//		Iterator<User> iterator = itr.iterator();
//		
//		while(iterator.hasNext())
//		{
//			User user = iterator.next();
//			System.out.println(user);
//		}
//		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//				
//			}
//					});
		
//		Iterable<User> itr = userRepo.findAll();
//		
//		itr.forEach(user->{System.out.println(user);});
		
//		userRepo.deleteById(102);
//		System.out.println("deleted");
		
		Iterable<User> allUsers = userRepo.findAll();
		allUsers.forEach(user->System.out.println(user));
		
		userRepo.deleteAll(allUsers);
	}

}
