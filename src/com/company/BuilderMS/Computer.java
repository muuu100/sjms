package com.company.BuilderMS;

/**
 * builder模式
 * 1.在Computer中创建一个静态内部类 Builder，然后将Computer 中的参数都复制到Builder类中。
 * 2.在Computer中创建一个private的构造函数，参数为Builder类型
 * 3.在Builder中创建一个public的构造函数，参数为Computer中必填的那些参数，cpu 和ram。
 * 4.在Builder中创建设置函数，对Computer中那些可选参数进行赋值，返回值为Builder类型的实例
 * 5.在Builder中创建一个build()方法，在其中构建Computer的实例并返回
 *
 * 重要
 * （1）User类的构造方法是私有的，也就是说调用者不能直接创建User对象。
 * （2）User类的属性都是不可变的，所有的属性都添加了final修饰符，并且在构造方法中设置了值，并且，对外只提供getters方法。
 * （3）Builder模式使用了链式调用，可读性更佳。
 * （4）Builder的内部类构造方法中只接收必传的参数，并且该必传的参数使用final修饰符。
 */
public class Computer {
    private final String cpu;//必须
    private final String ram;//必须
    private final int usbCount;//可选
    private final String keyboard;//可选
    private final String display;//可选

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.usbCount=builder.usbCount;
        this.keyboard=builder.keyboard;
        this.display=builder.display;
    }
    public String getCpu() {
        return cpu;
    }
    public String getRam() {
        return ram;
    }
    public int getUsbCount() {
        return usbCount;
    }
    public String getKeyboard() {
        return keyboard;
    }
    public String getDisplay() {
        return display;
    }

    public static class Builder{
        private String cpu;//必须
        private String ram;//必须
        private int usbCount;//可选
        private String keyboard;//可选
        private String display;//可选

        public Builder(String cup,String ram){
            this.cpu=cup;
            this.ram=ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
