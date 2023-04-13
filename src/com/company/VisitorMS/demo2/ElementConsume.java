package com.company.VisitorMS.demo2;

public class ElementConsume implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void someThingA() {
        System.out.println("支出:someThingA");
    }
}
