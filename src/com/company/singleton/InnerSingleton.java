package com.company.singleton;

/**
 * @author mjn
 * @date 2023-4-13
 */
public class InnerSingleton {
    private InnerSingleton() {
    }

    private static class InnerClass {
        private static final InnerSingleton instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return InnerClass.instance;
    }
}
