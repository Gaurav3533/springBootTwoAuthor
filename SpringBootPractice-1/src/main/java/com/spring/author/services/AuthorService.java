package com.spring.author.services;

import java.util.List;

import com.spring.author.entity.Author;

public interface AuthorService {

	List<Author> getAllAuthors();
	
	//to get a book by its id
	Author getAuthorById(String id);
	
	//edit the book details
	Author editAuthor(Author author);
	
	//delete the book
	void deleteAuthorById(String id);
}
