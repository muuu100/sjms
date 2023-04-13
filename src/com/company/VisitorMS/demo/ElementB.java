package com.company.VisitorMS.demo;

public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void doSomethingB() {
        System.out.println();
    }
}
