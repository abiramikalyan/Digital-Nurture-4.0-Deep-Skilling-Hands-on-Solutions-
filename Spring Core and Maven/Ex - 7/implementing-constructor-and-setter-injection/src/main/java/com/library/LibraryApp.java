package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
        
        BookService bookService = context.getBean("bookService", BookService.class);
        
        System.out.println("=== Testing Both Injection Types ===");
        String result = bookService.getBookDetails("978-1617294945");
        System.out.println(result);
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
