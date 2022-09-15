package com.library.FinalProject;

import static org.junit.Assert.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.library.persistene.Book;
import com.library.persistene.repository.BookRepo;
import com.library.service.BookService;

@SpringBootTest //annotation tells Spring Boot to load the application context for the application when the test is run
public class BookServiceUnitTest {
    
    @Autowired 
    public BookService service; //will be created (as it is a component), but a mock instance of PersonRepo will be created because of the @MockBean annotation

    @MockBean //This mock instance will then be injected into the PersonService instead of a real one.
    public BookRepo repo;

    @Test
    public void testCreate2() {
        Mockito.when(this.repo.save(new Book(0,"Lotr", "RR", true))).thenReturn(new Book(1L,"Lotr", "RR", true)); 
        Assertions.assertThat(this.service.addBook(new Book(0,"Lotr", "RR", true))).isEqualTo(new Book(1L,"Lotr", "RR", true));
        Mockito.verify(this.repo, Mockito.times(1)).save(new Book(0,"Lotr", "RR", true));
    }


}