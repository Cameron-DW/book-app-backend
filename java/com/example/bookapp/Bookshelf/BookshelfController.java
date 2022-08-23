package com.example.bookapp.Bookshelf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookshelf")
public class BookshelfController {

    @Autowired
    private BookshelfService bookshelfService;

    @PostMapping
    public Bookshelf saveBookshelf(@RequestBody Bookshelf bookshelf){
        return bookshelfService.saveBookshelf(bookshelf);
    }

    @GetMapping
    public List<Bookshelf> getAllBookshelfs(){

        return bookshelfService.getAllBookshelfs();
    }



}
