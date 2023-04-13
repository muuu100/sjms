package com.company.Prototype.demo1;

/**
 * @author mjn
 * @date 2022-6-19
 */
public class Realizetype1 implements Cloneable {

    String name;

    public Realizetype1() {
    }

    public Realizetype1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
