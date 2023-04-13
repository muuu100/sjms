package com.company.AdapterMS.demo1;

/**
 * 类的适配器模式
 * 原理：通过继承特性来实现适配器功能。
 */
public class UsbToVga1 extends USB implements VGA {
    @Override
    public void vgaInterface() {
        usbInterface();
        System.out.println("接收到USB信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}
