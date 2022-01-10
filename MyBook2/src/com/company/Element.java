package com.company;

interface Element {

    void add(Element element);
    void remove(Element element);

    void render();

    public void accept(Visitor visitor);
}
