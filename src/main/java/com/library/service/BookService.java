package com.library.service;



import org.springframework.stereotype.Service;

import com.library.persistene.Book;
import com.library.persistene.repository.BookRepo;

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

    public Book updateBook(long id, Book newBook) {
        Optional<Book> existingOptional = this.repo.findById(id);
        Book existing = existingOptional.get();

        existing.setId(newBook.getId());
        existing.setTitle(newBook.getTitle());
        existing.setAuthor(newBook.getAuthor());
        existing.setAvaible(newBook.isAvaible());

        return this.repo.save(existing);
    }

    public boolean removeBook(long id) {
        // removes the entity
        this.repo.deleteById(id);
        // checks to see if it still exists
        boolean exists = this.repo.existsById(id);
        // returns true if entity no longer exists
        return !exists;
    }


}
