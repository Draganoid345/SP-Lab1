package com.company;

import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapterList = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String title) {
        SubChapter subchapter = new SubChapter(title);
        subChapterList.add(subchapter);
        return subChapterList.size() - 1;
    }
    public SubChapter getSubChapter(int index) {
        return subChapterList.get(index);
    }

    public void print() {
        System.out.println(this.name);
        for(SubChapter subch : subChapterList) {
            subch.print();
        }
    }
}
