package com.company;

import java.util.ArrayList;

public class Section implements Element {
    protected String title;
    protected ArrayList<Element> sectionList = new ArrayList<Element>();

    public Section(String title) { this.title = title; }

    @Override
    public void render() {
        System.out.println(this.title);
        this.sectionList.forEach(Element::render);
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element el:sectionList) {
            el.accept(visitor);
        }
        visitor.visit(this);
    }

    @Override
    public void add(Element element) {
        this.sectionList.add(element);
    }

    @Override
    public void remove(Element element) {
        try {
            this.sectionList.remove(element);
        }
        catch(Exception e) {
            System.out.println("No such element in sectionList!");
        }
    }


}
