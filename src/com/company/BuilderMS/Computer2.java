package com.company.BuilderMS;

/**
 * Javabean 模式
 * 弊端：
 * （1）不可变类的所有好处都不复存在。
 * （2）对象会产生不一致的状态，当你想要传入5个参数的时候，你必须将所有的setxx方法调用完成之后才行，
 * 然而一部分的调用者看到这个对象后，以为这个对象已创建完毕，就直接使用了，其实User对象并没有创建完成。
 *     NutritionFacts cocaCola = new NutritionFacts();
 cocaCola.setServingSize(240);
 cocaCola.setServings(8);
 cocaCola.setCalories(100);
 cocaCola.setFat(27);
 构造过程被分到了几个调用中，在构造过程中java Bean可能处于不一致的状态，类无法仅仅通过检验构造方法参数的有效性来保证一致性，
 使用处于不一致状态的对象将会导致失败。另外javaBean阻止了把类做成不可变的可能，因此很难确保线程安全。
 */
public class Computer2 {
    private String cpu;//必须
    private String ram;//必须
    private int usbCount;//可选
    private String keyboard;//可选
    private String display;//可选

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }

    public static void main(String[] args) {
        Computer2 com = new Computer2();
        com.setCpu("");
        com.setRam("");
    }
}
