package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public String findByIsbn(String isbn) {
        return "Book Title: Effective Java, Author: Joshua Bloch, ISBN: " + isbn;
    }
}
