package com.library.repository;

public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository Constructor called");
    }

    public void saveBook(String bookName) {
        System.out.println("Book saved in repository: " + bookName);
    }
}