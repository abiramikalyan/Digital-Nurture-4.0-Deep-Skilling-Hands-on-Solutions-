package com.library.repository;

public class BookRepository {
    public String findByIsbn(String isbn) {
        return "Book details for ISBN: " + isbn + 
               "\nTitle: Spring in Action" + 
               "\nAuthor: Craig Walls";
    }
}
