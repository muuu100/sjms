package com.company.AdapterMS.demo2;

/**
 * 将220V电压转换成为5V电压
 * 对象适配器：组合来实现适配器功能的
 */
public class Adapter2 implements DC5V {

    private AC220V ac220V;

    public Adapter2(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int dc5v() {
        int input220v = ac220V.input220v();
        return (input220v / 44);
    }
}
