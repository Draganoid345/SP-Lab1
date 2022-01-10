package com.company;

import java.util.HashMap;
import java.util.Map;

public class BookStatistics implements Visitor {
    private Map<String, Integer> stats = new HashMap<String, Integer>();

    public BookStatistics() {
        this.stats.put("paragraph", 0);
        this.stats.put("image", 0);
        this.stats.put("table", 0);
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + this.stats.get("image"));
        System.out.println("*** Number of tables: " + this.stats.get("table"));
        System.out.println("*** Number of paragraphs: " + this.stats.get("paragraph"));
    }

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Paragraph paragraph) {
        Integer val = this.stats.get("paragraph");
        this.stats.put("paragraph", val + 1);
    }

    @Override
    public void visit(Section section) {

    }

    @Override
    public void visit(ImageProxy image) {
        Integer val = this.stats.get("image");
        this.stats.put("image", val + 1);
    }

    @Override
    public void visit(Image image) {
        Integer val = this.stats.get("image");
        this.stats.put("image", val + 1);
    }

    @Override
    public void visit(Table table) {
        Integer val = this.stats.get("table");
        this.stats.put("table", val + 1);

    }
}
