package com.library.FinalProject;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.apache.tomcat.util.http.parser.MediaType;

import static org.junit.Assert.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Ignore;
//import org.junit.Test; // Return Null !!!
//import org.junit.jupiter.api.Disabled;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.persistene.Book;
import com.library.persistene.repository.BookRepo;
import com.library.rest.controller.BookController;
import com.library.service.BookService;

@SpringBootTest //annotation tells Spring Boot to load the application context for the application when the test is run
public class BookServiceUnitTest {
    
    @Autowired 
    public BookService service; //will be created (as it is a component), but a mock instance of PersonRepo will be created because of the @MockBean annotation

    @MockBean //This mock instance will then be injected into the PersonService instead of a real one.
    public BookRepo repo;

    final List<Book> BOOK = List.of(new Book(null,"Lotr", "RR", true), new Book( 1L, "Lotr", "RR", true));

    @BeforeEach
    public void init(){
        repo.saveAll(BOOK);
    }

    @Ignore
    @Test
    public void testCreate2() {

         final Book TEST_Book = new Book(null,"Lotr", "RR", true); // 
         final Book TEST_SAVED_Book = new Book( 1L, "Lotr", "RR", true);
        


        Mockito.when(this.repo.save(new Book(1L,"Lotr", "RR", true))).thenReturn(new Book(1L,"Lotr", "RR", true)); 
        Assertions.assertThat(this.service.addBook(TEST_Book)).isEqualTo(TEST_SAVED_Book);
        Mockito.verify(this.repo, Mockito.times(1)).save(new Book(null,"Lotr", "RR", true));
    }


    

}

