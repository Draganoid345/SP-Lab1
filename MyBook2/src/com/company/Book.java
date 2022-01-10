package com.company;

import java.util.ArrayList;

public class Book extends Section{
    private ArrayList<Author> authors;

    public Book(String title) {
        super(title);

        this.authors = new ArrayList<Author>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Element sec) {
        this.add(sec);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void render() {
        System.out.println("Book: " + this.title + "\n");

        System.out.println("Authors:");
        this.authors.forEach(Author::print);
        System.out.println();

//        super.print();
        this.sectionList.forEach(Element::render);
    }
}
