package com.cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.Author;
import com.cogent.service.AuthorService;

@RestController
@RequestMapping("author")
public class AuthorController {
	@Autowired
	AuthorService service;
	@GetMapping
	public List<Author> getAll(){
		return service.getAll();
	}
	@PostMapping
	public Author addAuthor(@RequestBody Author author) {
		return service.addAuthor(author);
	}
	@PutMapping
	public Author update(@RequestBody Author author) {
		return service.addAuthor(author);
	}
	@DeleteMapping("{id}")
	public String delete(@PathVariable int id) {
		return service.deleteById(id);
	}
	
}
