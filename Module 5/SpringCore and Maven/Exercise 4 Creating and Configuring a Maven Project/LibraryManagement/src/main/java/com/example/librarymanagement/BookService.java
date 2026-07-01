package com.example.librarymanagement;


public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;


    }
    public void display(){
        System.out.println("Book service display function");
        bookRepository.display();
    }
}
