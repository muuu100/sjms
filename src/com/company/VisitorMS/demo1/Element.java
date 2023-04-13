package com.company.VisitorMS.demo1;

public interface Element {
    public void accept(Visitor visitor);
    public int getKpi();
}
