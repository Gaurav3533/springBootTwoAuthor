package com.spring.author.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.author.entity.Author;
import com.spring.author.repository.AuthorRepository;
import com.spring.author.services.AuthorService;

@Service
public class AuhorServiceImpl implements AuthorService {
	
	private AuthorRepository repository;
	public AuhorServiceImpl(AuthorRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<Author> getAllAuthors() {
		return (List<Author>) repository.findAll();
	}

	@Override
	public Author getAuthorById(String id) {
		return repository.findById(id).get();
	}

	@Override
	public Author editAuthor(Author author) {
		return repository.save(author);
	}

	@Override
	public void deleteAuthorById(String id) {
		repository.deleteById(id);
		
	}

}
