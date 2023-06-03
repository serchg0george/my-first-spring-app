package com.springapplication.spring6webapp.repositories;

import com.springapplication.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
