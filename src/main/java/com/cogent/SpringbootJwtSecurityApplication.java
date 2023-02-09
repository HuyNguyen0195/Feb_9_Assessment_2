package com.cogent;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.entity.Author;
import com.cogent.entity.User;
import com.cogent.repository.AuthorRepository;
import com.cogent.repository.UserRepository;

@SpringBootApplication
public class SpringbootJwtSecurityApplication {
	 @Autowired
	    private UserRepository repository;
	 @Autowired
	 	private AuthorRepository authorRepository;
	    @PostConstruct
	    public void initUsers() {
	        List<User> users = Stream.of(
	                new User(101, "huy", "password", "huy@gmail.com"),
	                new User(102, "user1", "pwd1", "user1@gmail.com")
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	        
	        List<Author> authors = Stream.of(
	        		new Author(1,"huy","wylie",1000),
	        		new Author(2,"phil","dallas",1000),
	        		new Author(3,"john","garland",1000)
	        		).collect(Collectors.toList());
	        authorRepository.saveAll(authors);
	    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtSecurityApplication.class, args);
	}

}
