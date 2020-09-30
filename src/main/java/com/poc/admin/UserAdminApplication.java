package com.poc.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poc.admin.model.User;
import com.poc.admin.repository.UserRepository;

@SpringBootApplication
public class UserAdminApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserAdminApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Girish", "Dondapati", "giris@gmail.com","789456123"));
		this.userRepository.save(new User("Mike", "Tison", "mike@gmail.com","321546789"));
	}
}
