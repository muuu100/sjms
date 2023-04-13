package com.company.singleton;

/**
 * @author mjn
 * @date 2023-4-13
 */
public class HungrySingleton1 {

    private static final HungrySingleton1 singleton;

    static {
        singleton = new HungrySingleton1();
    }

    private HungrySingleton1() {
    }

    public static HungrySingleton1 getInstance() {
        return singleton;
    }
}
