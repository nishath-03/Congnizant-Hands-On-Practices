package com.example.librarymanagement;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service public class BookService {

    //field injection
    @Autowired
    private BookRepository bookrepo;

    // Setter injection
    // @Autowired
    // public void setBookRepository(BookRepository bookrepository){
    // this.bookrepo = bookrepository;
    // }

    // constructor injection
    // @Autowired
    // public BookService(BookRepository bookrepository){
    // this.bookrepo = bookrepository;
    // }

       pu c void display() {
        System.out.println("from service class BookService");
        bookrepo.display();

        
}
