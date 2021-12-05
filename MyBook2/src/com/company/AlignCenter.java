package com.company;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(String text) {
        System.out.println("Paragraph with center alignment: " + text);
    }
}
