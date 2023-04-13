package com.company.Flyweight.demo1;

//抽象享元角色
interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}