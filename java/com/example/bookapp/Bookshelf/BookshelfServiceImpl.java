package com.example.bookapp.Bookshelf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookshelfServiceImpl implements BookshelfService{

    @Autowired
    private BookshelfRepository bookshelfRepository;

    @Override
    public Bookshelf saveBookshelf(Bookshelf bookshelf){
        return bookshelfRepository.save(bookshelf);
    }


    public List<Bookshelf> getAllBookshelfs(){
        return bookshelfRepository.findAll();
    }

}
