package com.company.AdapterMS.demo1;

/**
 * 对象的适配器模式
 * 原理：通过组合方式来实现适配器功能。
 */
public class UsbToVga2 implements VGA {
    private USB usb;

    public UsbToVga2(USB phone) {
        this.usb = phone;
    }

    @Override
    public void vgaInterface() {
        if(usb != null) {
            usb.usbInterface();
            System.out.println("接收到USB信息，信息转换成VGA接口中...");
            System.out.println("信息已转换成VGA接口，显示屏可以对接。");
        }
    }
}
