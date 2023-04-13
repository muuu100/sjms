package com.company.AdapterMS.demo1;

/**
 *  接口的适配器模式
 *  原理：借助抽象类来实现适配器功能。
 */
public class UsbToVga3 extends VGA_A {
    @Override
    public void vgaInterface() {
        System.out.println("接收到USB信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}
