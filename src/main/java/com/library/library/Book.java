package com.library.library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private boolean avaible;
    
    public Book(long id, String title, String author, boolean avaible) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.avaible = avaible;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
