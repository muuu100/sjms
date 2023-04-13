package com.company.singleton;

/**
 * @author mjn
 * @date 2023-4-13
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
