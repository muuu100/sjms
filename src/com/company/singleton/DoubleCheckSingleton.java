package com.company.singleton;

/**
 * @author mjn
 * @date 2023-4-13
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
