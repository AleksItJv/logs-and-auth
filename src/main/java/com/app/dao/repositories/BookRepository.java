package com.app.dao.repositories;

import com.app.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> getBooksByYear(int year);

}
