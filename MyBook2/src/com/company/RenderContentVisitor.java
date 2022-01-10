package com.company;

public class RenderContentVisitor implements Visitor{
    @Override
    public void visit(Book book) {
        book.render();
    }

    @Override
    public void visit(Paragraph paragraph) {
        paragraph.render();
    }

    @Override
    public void visit(Section section) {
        section.render();
    }

    @Override
    public void visit(ImageProxy image) {
        image.render();
    }

    @Override
    public void visit(Image image) {
        image.render();
    }

    @Override
    public void visit(Table table) {
        table.render();
    }
}
