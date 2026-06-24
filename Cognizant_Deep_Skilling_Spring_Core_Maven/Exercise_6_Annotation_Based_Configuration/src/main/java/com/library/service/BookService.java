package com.library.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public void displayService() {
        System.out.println("BookService is working using @Service annotation");
    }
}