package com.company.Observer.demo;

public class ConcreteSubject extends Subject {
    public void doSomething(){
        System.out.println("ConcreteSubject : notify-Before");
        notifyObserver();
        System.out.println("ConcreteSubject : notify-After");
    }
}
