package com.company;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(this.title);
    }
}
