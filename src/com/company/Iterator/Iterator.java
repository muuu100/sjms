package com.company.Iterator;

//抽象迭代器
interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}