package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;
import com.library.repository.BookRepository;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =
                (BookService) context.getBean("bookService");

        BookRepository repository =
                (BookRepository) context.getBean("bookRepository");

        service.displayService();
        repository.displayRepository();

        context.close();
    }
}