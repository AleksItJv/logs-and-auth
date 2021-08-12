package com.app.services.interfaces;

import com.app.entities.Book;

import java.util.List;

public interface BookDAO {

    void addBook(Book book);

    List<Book> findAll();

    List<Book> getBooksByYear(int year);

    void throwException();
}
