package com.cogent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Author;
import com.cogent.repository.AuthorRepository;

@Service
public class AuthorService {
	@Autowired
	AuthorRepository reposirory;
	public List<Author> getAll() {
		return reposirory.findAll();
	}
	public Author addAuthor(Author author) {
		return reposirory.save(author);
	}
	public String deleteById(int id) {
		reposirory.deleteById(id);
		return "deleted author id "+id;
	}
}
