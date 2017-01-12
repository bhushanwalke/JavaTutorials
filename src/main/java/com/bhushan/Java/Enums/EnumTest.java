package com.bhushan.Java.Enums;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * Created by bhushan on 12/31/16.
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books: ");

        for (Book book: Book.values())
            System.out.println(book + book.getTitle() + book.getCopyrightYear());

        for (Book book: EnumSet.range(Book.CPPHTP, Book.ASD))
            System.out.println(book + book.getTitle());
    }
}
