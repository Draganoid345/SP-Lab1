package com.company;

public class ImageProxy implements Element, Picture {
    private Image realImage;
    private String url;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    public Image loadImage() {
        if(this.realImage == null) {
            this.realImage = new Image(this.url);
        }
        return this.realImage;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void render() {
        loadImage();
        this.realImage.render();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public void dim() {

    }

    @Override
    public void content() {

    }
}
