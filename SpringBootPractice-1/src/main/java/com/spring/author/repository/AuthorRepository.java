package com.spring.author.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.author.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, String> {

}
