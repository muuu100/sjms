package com.company.Observer.weixin;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者（ConcreteSubject）
 */
public class SubscriptionSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> list = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : list) {
            observer.update(message);
        }
    }
}
