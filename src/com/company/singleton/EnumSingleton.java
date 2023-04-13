package com.company.singleton;

/**
 * @author mjn
 * @date 2023-4-13
 */
public enum EnumSingleton {
    singleton;

    public void method() {
        System.out.println("EnumSingle " + singleton.hashCode());
    }

    public static void main(String[] args) {
        EnumSingleton.singleton.method();
        EnumSingleton.singleton.method();
    }
}


