package com.company;

import java.util.concurrent.TimeUnit;

public class Image implements Picture, Element {
    private String imageName;


    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render() {
        System.out.println("Image with title: " + this.imageName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public void dim() {

    }

    @Override
    public void content() {

    }
}
