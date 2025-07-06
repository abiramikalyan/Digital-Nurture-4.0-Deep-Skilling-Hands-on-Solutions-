package com.library.repository;

public class BookRepository {
    public String findByIsbn(String isbn) {
        // In a real application, this would query a database
        return "Book details for ISBN: " + isbn + 
               "\nTitle: Spring in Action" + 
               "\nAuthor: Craig Walls";
    }
}