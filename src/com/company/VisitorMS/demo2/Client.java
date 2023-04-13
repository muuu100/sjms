package com.company.VisitorMS.demo2;

public class Client {
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();

//        accountBook.addBill(new ElementConsume());
//        accountBook.addBill(new ElementIncome());

        Visitor boss = new VisitorBoss();
        Visitor cpa = new VisitorCPA();

        accountBook.showAccount(boss);
        accountBook.showAccount(cpa);
    }
}
