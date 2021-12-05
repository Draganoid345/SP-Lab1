package com.company;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy strategy;

    public Paragraph(String text) {
        this.text = text;
        this.strategy = null;
    }


    public void print() {
        if(this.strategy == null) {
            System.out.println("Paragraph: " + this.text);
        }
        else{
            strategy.render(this.text);
        }
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.strategy = strategy;
    }

}
