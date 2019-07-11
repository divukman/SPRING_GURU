package com.dimitar.guru.section2.repositories;

import com.dimitar.guru.section2.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
