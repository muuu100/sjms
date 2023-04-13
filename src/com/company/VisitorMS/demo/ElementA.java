package com.company.VisitorMS.demo;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void doSomethingA() {
        System.out.println();
    }
}
