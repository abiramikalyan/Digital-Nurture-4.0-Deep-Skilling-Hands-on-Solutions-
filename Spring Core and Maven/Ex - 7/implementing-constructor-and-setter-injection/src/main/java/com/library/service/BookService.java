package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private final BookRepository bookRepository;
    private InventoryService inventoryService;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService initialized via constructor injection");
    }

    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
        System.out.println("InventoryService set via setter injection");
    }

    public String getBookDetails(String isbn) {
        String bookInfo = bookRepository.findByIsbn(isbn);
        String inventoryStatus = inventoryService.checkInventory(isbn);
        return bookInfo + "\n" + inventoryStatus;
    }
}
