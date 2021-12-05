package com.company;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(String text) {
        System.out.println("Paragraph with right alignment: " + text);
    }
}
