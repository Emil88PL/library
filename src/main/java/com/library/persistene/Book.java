package com.library.persistene;

//import java.util.function.IntPredicate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private boolean avaible;

    public Book(){
        super();
    }
    
    public Book(Long id, String title, String author, boolean avaible) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.avaible = avaible;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isAvaible() {
        return avaible;
    }
    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }

 
}
