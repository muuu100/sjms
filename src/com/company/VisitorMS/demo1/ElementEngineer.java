package com.company.VisitorMS.demo1;

public class ElementEngineer implements Element{
    String name;
    public ElementEngineer(String name){
        this.name = name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getKpi() {
        return 9;
    }

    public int getCodeLines() {
        return 99999;
    }
}
