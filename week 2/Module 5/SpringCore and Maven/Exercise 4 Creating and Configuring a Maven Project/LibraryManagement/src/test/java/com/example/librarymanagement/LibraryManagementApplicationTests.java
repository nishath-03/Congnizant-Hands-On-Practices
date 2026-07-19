package com.example.librarymanagement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
class LibraryManagementApplicationTests {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void contextLoads() {
        assertNotNull(bookService, "BookService bean should be loaded and injected");
        assertNotNull(bookRepository, "BookRepository bean should be loaded and injected");
    }
}
