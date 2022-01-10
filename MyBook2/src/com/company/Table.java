package com.company;

public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }


    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public void render() {
        System.out.println("Table with title: " + this.title);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
