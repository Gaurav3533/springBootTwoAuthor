package com.spring.author.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.author.entity.Author;
import com.spring.author.services.AuthorService;

@RestController
public class AuthorController {

	private AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		super();
		this.authorService = authorService;
	}
	
	@GetMapping("/authors")	
	private List<Author> getAuthors(){
		return authorService.getAllAuthors();
	}
	
}
