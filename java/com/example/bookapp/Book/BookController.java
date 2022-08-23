package com.example.bookapp.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    private List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping
    private Book saveBook(@RequestBody Book book){
    return bookService.saveBook(book);
    }

}
