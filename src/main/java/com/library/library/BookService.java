package com.library.library;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService {

    private BookRepo repo;

    public BookService(BookRepo repo) {
        super();
        this.repo = repo;
    }

    public Book addBook(Book book) {
        return this.repo.save(book);
    }

     public List<Book> getallBooks() {
        return this.repo.findAll();
    }

    public Book updateBook(Long id, Book newBook) {
        Optional<Book> existingOptional = this.repo.findById(id);
        Book existing = existingOptional.get();

        
        existing.setAuthor(newBook.getAuthor());

        return this.repo.save(existing);
    }

    public boolean removeBook(Long id) {
        // removes the entity
        this.repo.deleteById(id);
        // checks to see if it still exists
        boolean exists = this.repo.existsById(id);
        // returns true if entity no longer exists
        return !exists;
    }
}
