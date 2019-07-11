package com.dimitar.guru.section2.repositories;

import com.dimitar.guru.section2.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
