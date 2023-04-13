package com.company.VisitorMS.demo1;

public class Client {

    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();


        businessReport.addElement(new ElementEngineer("小王"));
        businessReport.addElement(new ElementManager("龙哥"));

        businessReport.showReport(new VisitorCEO());
        businessReport.showReport(new VisitorCTO());

    }

}
