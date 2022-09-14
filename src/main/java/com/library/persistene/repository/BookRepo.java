package com.library.persistene.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.persistene.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{
    
}
