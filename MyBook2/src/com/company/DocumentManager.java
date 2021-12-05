package com.company;

public class DocumentManager {
    private static DocumentManager instance = new DocumentManager();
    private Book book;
    private DocumentManager(){}

    public static DocumentManager getInstance() {
        return instance;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public Book getBook() {
        return this.book;
    }
}
