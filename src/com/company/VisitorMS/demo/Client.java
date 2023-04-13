package com.company.VisitorMS.demo;

public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ElementA());
        objectStructure.add(new ElementB());
        objectStructure.show(new VisitorM());
        objectStructure.show(new VisitorN());
    }

}
