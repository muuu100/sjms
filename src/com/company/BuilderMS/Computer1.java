package com.company.BuilderMS;

/**
 * 折叠构造函数模式
 *弊端：
 （1）一旦参数多了，代码可读性就差，并且难以维护。
 （2）对调用者来说麻烦。
 */
public class Computer1 {
    private String cpu;//必须
    private String ram;//必须
    private int usbCount;//可选
    private String keyboard;//可选
    private String display;//可选

    public Computer1(String cpu, String ram) {
        this(cpu, ram, 0);
    }
    public Computer1(String cpu, String ram, int usbCount) {
        this(cpu, ram, usbCount, "");
    }
    public Computer1(String cpu, String ram, int usbCount, String keyboard) {
        this(cpu, ram, usbCount, keyboard, "");
    }
    public Computer1(String cpu, String ram, int usbCount, String keyboard, String display) {
        this.cpu = cpu;
        this.ram = ram;
        this.usbCount = usbCount;
        this.keyboard = keyboard;
        this.display = display;
    }
}
