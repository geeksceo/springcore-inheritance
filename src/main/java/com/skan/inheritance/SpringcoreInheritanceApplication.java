package com.skan.inheritance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.skan.inheritance.entity.Student;
import com.skan.inheritance.entity.Teacher;
import com.skan.inheritance.entity.User;
import com.skan.inheritance.service.UserService;

@SpringBootApplication
public class SpringcoreInheritanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreInheritanceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner test(
			UserService userService) {
		return (args) -> {
			
			System.out.println("----------------------------------");
			System.out.println("----------Create few teachers-----");
			System.out.println("----------------------------------");

			userService.save(new Student("geeksceo", "oowashina@gmail.com"));
			userService.save(new Teacher("zeze", "s.zeze@univ-na.ci"));
			userService.save(new Teacher("tanfolo", "tanfolo@skan.com", "MAT20230308"));
			userService.save(new Student("adam", "adam@skan.com", "CI021505505"));
			
			// RETRIEVE USER DATUM
			User user1 = userService.findByName("geeksceo");
			User user2 = userService.findByEmail("s.zeze@univ-na.ci");
			
			((Student)user1).setNce("CI0218050544");
			userService.save(user1);
			
			for(User user : userService.findAll()) {
				System.out.println(user);
			}
			
		};
	}


}
