package com.company.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author mjn
 * @date 2023-4-13
 */
public class CASSingleton {
    private CASSingleton() {
    }

    private static AtomicReference<CASSingleton> reference = new AtomicReference<>();

    public static CASSingleton getInstance() {
        while (true) {
            CASSingleton singleton = reference.get();
            if (singleton != null) {
                return singleton;
            }
            singleton = new CASSingleton();
            if (reference.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }
}
