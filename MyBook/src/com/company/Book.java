package com.company;

public class Book {
    private String name = "";
    private String text = "";

    public Book(String name) {
        this.name = name;
    }

    public void createNewParagraph(String str) {
        this.text += str + "\n";
    }

    public void createNewImage(String str) {
        this.text += str + "\n";
    }

    public void createNewTable(String str) {
        this.text += str + "\n";
    }

    public void print() {
        System.out.println(this.text);
    }

}
