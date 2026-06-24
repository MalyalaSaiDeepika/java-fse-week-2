package com.library.controller;

import com.library.entity.Book;
import com.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.save(book);
    }

    @GetMapping
    public List<Book> getBooks() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.delete(id);
        return "Book deleted successfully";
    }
}