package com.company.VisitorMS.demo;

public class VisitorM implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        elementA.doSomethingA();
    }
    @Override
    public void visit(ElementB elementB) {
        elementB.doSomethingB();
    }
}
