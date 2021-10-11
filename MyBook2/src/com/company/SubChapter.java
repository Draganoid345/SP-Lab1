package com.company;


import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Element> content = new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String content) {
        Paragraph paragraph = new Paragraph(content);
        this.content.add(paragraph);
    }

    public void createNewImage(String content) {
        Image image = new Image(content);
        this.content.add(image);
    }

    public void createNewTable(String content) {
        Table table = new Table(content);
        this.content.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for(Element el : this.content){
            el.print();
        }
    }

}
