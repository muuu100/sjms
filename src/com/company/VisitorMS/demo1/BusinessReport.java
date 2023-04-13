package com.company.VisitorMS.demo1;

import java.util.ArrayList;
import java.util.List;


public class BusinessReport {

    List<Element> list = new ArrayList<Element>();

    public void addElement(Element element){
        list.add(element);
    }

    public void showReport(Visitor visitor){
        for (Element element: list) {
            element.accept(visitor);
        }
    }

}
