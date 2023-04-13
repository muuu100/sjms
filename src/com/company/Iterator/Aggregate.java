package com.company.Iterator;

//抽象聚合
interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}