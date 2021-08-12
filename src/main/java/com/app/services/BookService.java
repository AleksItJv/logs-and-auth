package com.app.services;

import com.app.services.interfaces.BookDAO;
import com.app.repositories.BookRepository;
import com.app.entities.Book;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookDAO {

    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return Lists.newArrayList(bookRepository.findAll());
    }

    @Override
    public List<Book> getBooksByYear(int year) {
        return Lists.newArrayList(bookRepository.getBooksByYear(year));
    }

    @Override
    public void throwException() {
        throw new UnsupportedOperationException("Books.. Not support yet!");
    }

}
