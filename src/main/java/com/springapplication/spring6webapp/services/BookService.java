package com.springapplication.spring6webapp.services;

import com.springapplication.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
