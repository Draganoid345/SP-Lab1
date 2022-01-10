package com.company;

public interface Picture {
    void render();

    void add(Element element);

    void remove(Element element);

    String url();
    void dim();
    void content();
}
