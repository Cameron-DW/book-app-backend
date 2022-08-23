package com.example.bookapp.Book;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book saveBook(Book book);


}
