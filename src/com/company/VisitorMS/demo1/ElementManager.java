package com.company.VisitorMS.demo1;

public class ElementManager implements Element {
    String name;
    public ElementManager(String name){
        this.name = name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getKpi() {
        return 10;
    }

    public int getProductCount(){
        return 5;
    }
}
