package com.company.VisitorMS.demo2;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {

    List<Element> list = new ArrayList<Element>();
//    public void addBill(Element element){
//        list.add(element);
//    }
    public AccountBook() {
        list.add(new ElementConsume());
        list.add(new ElementIncome());
    }

    public void showAccount(Visitor visitor){
        for (Element element : list){
            element.accept(visitor);
        }
    }
}
