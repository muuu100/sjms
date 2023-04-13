package com.company.Observer.demo;

public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserverA : update");
    }
}
