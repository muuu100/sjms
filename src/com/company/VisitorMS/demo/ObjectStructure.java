package com.company.VisitorMS.demo;

import java.util.ArrayList;
import java.util.List;


public class ObjectStructure {
    List<Element> list = new ArrayList<Element>();
    public void add(Element element){
        list.add(element);
    }
    public void show(Visitor visitor){
        for (Element element: list) {
            element.accept(visitor);
        }
    }
}
