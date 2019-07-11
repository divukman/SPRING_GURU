package com.dimitar.guru.section2.bootstrap;

import com.dimitar.guru.section2.entities.Author;
import com.dimitar.guru.section2.entities.Book;
import com.dimitar.guru.section2.entities.Publisher;
import com.dimitar.guru.section2.repositories.AuthorRepository;
import com.dimitar.guru.section2.repositories.BookRepository;
import com.dimitar.guru.section2.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    @Autowired
    public Bootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData() {
        final Publisher harperCollins = new Publisher("Harper Collins");
        publisherRepository.save(harperCollins);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain driven design", "1234");
        setBookData(harperCollins, eric, ddd);


        final Publisher worx = new Publisher("Worx");
        publisherRepository.save(worx);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "12345");
        setBookData(worx, rod, noEJB);
    }

    private void setBookData(Publisher publisher, Author author, Book book) {
        book.setPublisher(publisher);

        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
