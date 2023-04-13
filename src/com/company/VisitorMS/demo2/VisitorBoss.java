package com.company.VisitorMS.demo2;

public class VisitorBoss implements Visitor{
    @Override
    public void visit(ElementConsume elementConsume) {
        elementConsume.someThingA();
    }

    @Override
    public void visit(ElementIncome elementIncome) {
        elementIncome.someThingB();
    }
}
