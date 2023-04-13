package com.company.Prototype.demo1;

/**
 * @author mjn
 * @date 2022-6-19
 */
public class User implements Cloneable {
    private String name;

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
