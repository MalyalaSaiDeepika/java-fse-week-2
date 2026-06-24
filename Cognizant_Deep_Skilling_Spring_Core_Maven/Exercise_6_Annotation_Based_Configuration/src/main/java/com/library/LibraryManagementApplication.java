package com.library;

import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service = context.getBean(BookService.class);
        BookRepository repository = context.getBean(BookRepository.class);

        service.displayService();
        repository.displayRepository();

        context.close();
    }
}