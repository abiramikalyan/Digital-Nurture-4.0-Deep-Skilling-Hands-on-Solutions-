package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Dependency Injection: BookRepository set in BookService");
        this.bookRepository = bookRepository;
    }

    public String getBookDetails(String isbn) {
        return bookRepository.getBookInfo(isbn);
    }

    public int getTotalBooks() {
        return bookRepository.getBookCount();
    }
}
