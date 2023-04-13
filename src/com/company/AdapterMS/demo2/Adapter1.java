package com.company.AdapterMS.demo2;

/**
 * 将220V电压转换成为5V电压
 * 类适配器:通过继承来实现适配功能的
 */
public class Adapter1 extends AC220V implements DC5V {
    @Override
    public int dc5v() {
        int input220v = input220v();
        return (input220v / 44);
    }
}
