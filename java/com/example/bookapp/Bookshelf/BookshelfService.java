package com.example.bookapp.Bookshelf;

import java.util.List;

public interface BookshelfService {

    Bookshelf saveBookshelf(Bookshelf bookshelf);

    List<Bookshelf> getAllBookshelfs();

}
