package com.company.AdapterMS.demo1;

public class Client {
    public static void main(String[] args) {
        //第一种适配器用法
        System.out.println("-------------类适配器------------");
        UsbToVga1 vga = new UsbToVga1();
        vga.vgaInterface();
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");

        //第二种适配器用法
        System.out.println("-------------对象适配器------------");
        UsbToVga2 vga2 = new UsbToVga2(new USB());
        vga2.vgaInterface();
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");

        //第三种适配器用法
        System.out.println("-------------接口适配器------------");
        UsbToVga3 vga3 = new UsbToVga3();
        vga3.vgaInterface();
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");
    }
}
