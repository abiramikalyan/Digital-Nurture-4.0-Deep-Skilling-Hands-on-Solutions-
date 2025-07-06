package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.library.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        BookService bookService = context.getBean(BookService.class);

        System.out.println("--- Library Management System ---");
        String bookInfo = bookService.getBookDetails("978-3-16-148410-0");
        System.out.println(bookInfo);

        ((AnnotationConfigApplicationContext) context).close();
    }
}
