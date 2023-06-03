package com.springapplication.spring6webapp.services;

import com.springapplication.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
