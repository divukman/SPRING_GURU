package com.dimitar.guru.section2.rest;

import com.dimitar.guru.section2.entities.Author;
import com.dimitar.guru.section2.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorsRestController {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorsRestController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @GetMapping("/api/v1/authors")
    public ResponseEntity<?> getAuthors() {
        final Iterable<Author> authors = authorRepository.findAll();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }
}
