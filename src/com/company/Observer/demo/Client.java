package com.company.Observer.demo;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer objectA = new ConcreteObserverA();
        subject.addObserver(objectA);
        Observer objectB = new ConcreteObserverB();
        subject.addObserver(objectB);
        subject.doSomething();
    }
}
