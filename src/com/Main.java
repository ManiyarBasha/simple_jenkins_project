package com;

import com.model.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        // Setting values using setter methods
        book.setTitle("Complete Java");
        book.setAuthor("Herbert Schildt");

        // Printing book details using toString()
        System.out.println(book);
    }
}
