// package com.library.library;


// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;

// import com.library.persistene.Book;
// import com.library.persistene.repository.BookRepo;
// import com.library.service.BookService;

// import static org.assertj.core.api.Assertions.assertThat;

// @SpringBootTest
// public class BookTest {
    
//     @Autowired
//     private BookService service;

//     @MockBean
//     private BookRepo repo;

 
//     @Test
//     void testCreate(){
//         // GIVEN is our testing data - you can make this a final local variable if you want, e.g.:
//         final Book TEST_Book = new Book(9781492077992l, "Head First Design Patterns", "Freeman", true);
//         final Book TEST_SAVED_Book = new Book(9780140237504l, "The Catcher in the Rye", "Salinger", false);
    
//         // WHEN
//         Mockito.when(this.repo.save(TEST_Book)).thenReturn(TEST_SAVED_Book);
    
//         // THEN
//         Assertions.assertThat(TEST_Book).isEqualTo(TEST_SAVED_Book);
        
    
//         // verify that our repo was accessed exactly once
//         Mockito.verify(this.repo, Mockito.times(1)).save(TEST_Book);
//     }

    
// }
