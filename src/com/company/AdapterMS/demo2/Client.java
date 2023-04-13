package com.company.AdapterMS.demo2;

import com.company.AdapterMS.demo2.ACV.ACV_110V;
import com.company.AdapterMS.demo2.ACV.ACV_220V;

public class Client {
    public static void main(String[] args) {
//        System.out.println("-------------类适配器------------");
//        DC5V dc5V =  new Adapter1();
//        int dc5 = dc5V.dc5v();
//        System.out.println("输入的电压为：" + new AC220V().input220v() + " 伏...");
//        System.out.println("转换后的电压为：" + dc5 + " 伏...");

//        System.out.println("-------------对象适配器------------");
//        DC5V dc5V =  new Adapter2(new AC220V());
//        int dc5 = dc5V.dc5v();
//        System.out.println("输入的电压为：" + new AC220V().input220v() + " 伏...");
//        System.out.println("转换后的电压为：" + dc5 + " 伏...");

//        System.out.println("-------------接口适配器------------");
//        DC5V dc5V = new Adapter3(new ACV_220V());
//        int dc = dc5V.dc5v();
//        System.out.println("输入的电压为：" + new ACV_220V().input() + " 伏...");
//        System.out.println("转换后的电压为：" + dc + " 伏...");

        DC5V dc5V = new Adapter3(new ACV_110V());
        int dc = dc5V.dc5v();
        System.out.println("输入的电压为：" + new ACV_110V().input() + " 伏...");
        System.out.println("转换后的电压为：" + dc + " 伏...");
    }
}
