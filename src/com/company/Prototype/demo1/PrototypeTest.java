package com.company.Prototype.demo1;

//原型模式的测试类
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));


        Realizetype1 r = new Realizetype1();
        Realizetype1 r2 = (Realizetype1) r.clone();
//        System.out.println("r==r2?" + (r.getName() == r2.getName()));
        System.out.println("r==r2?" + (r == r2));

        User user = new User();
        user.setName("muuu");
        Realizetype2 o = new Realizetype2(user);
        Realizetype2 o2 = (Realizetype2) o.clone();
//        System.out.println("o==o2?" + (o.getUser() == o2.getUser()));
        System.out.println("o==o2?" + (o == o2));
    }
}