package com.company.Command;

/**
 * 命令模式
 */
public class CommandPattern {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommandA();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}