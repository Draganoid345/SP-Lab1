package com.company;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Chapter> chapterList = new ArrayList<Chapter>();
    private Author author;

    public Book(String title) {
        this.title = title;
    }

    public int createChapter(String title) {
        Chapter chapter = new Chapter(title);
        chapterList.add(chapter);
        return chapterList.size() - 1;
    }

    public Chapter getChapter(int index) {
        return chapterList.get(index);
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public void print() {
        System.out.println(this.title);
    }
}
