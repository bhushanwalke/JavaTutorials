package com.bhushan.Java.Enums;

/**
 * Created by bhushan on 12/31/16.
 */
public enum Book {
    
    JHTP("Java How To Program", "2015"),
    CPPHTP("C++ How To Program", "2014"),
    ASD;

    private final String title;
    private final String copyrightYear;

    Book(String t, String cy) {
        this.title = t;
        this.copyrightYear = cy;
    }


    Book() {
        this(null, null);
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }


}
