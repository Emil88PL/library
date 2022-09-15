package com.library.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.persistene.Book;
import com.library.service.BookService;

@RestController
//@RequestMapping("/book")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        super();
        this.service = service;
    }

    @PostMapping("/create")
    public Book addBook(@RequestBody Book book) {
        return this.service.addBook(book);
    }
    
    @GetMapping("/getAll")
    public List<Book> getallBooks() {
        return this.service.getallBooks();
    }

    @PutMapping("/update")
    public Book updateBook(@PathParam("id") Long id, @RequestBody Book book) {
        return this.service.updateBook(id, book);
    }
    
    @DeleteMapping("/delete/{id}")
    public boolean removeBook(@PathVariable Long id) {
        return this.service.removeBook(id);
    }

}
