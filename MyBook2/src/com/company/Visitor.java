package com.company;

public interface Visitor {
    public void visit(Book book);
    public void visit(Paragraph paragraph);
    public void visit(Section section);
    public void visit(ImageProxy image);
    public void visit(Image image);
    public void visit(Table table);
}
