package com.company.VisitorMS.demo2;

public class ElementIncome implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void someThingB() {
        System.out.println("收入:someThingB");
    }
}
