package com.company.AdapterMS.demo2;

import com.company.AdapterMS.demo2.ACV.ACV_110V;
import com.company.AdapterMS.demo2.ACV.ACV_220V;
import com.company.AdapterMS.demo2.ACV.ACV;

/**
 * 接口适配器
 * 相对更加灵活,不管接入的是多少伏的电源，最终都能保证输出电源为5V,达到万能适配的效果
 */
public class Adapter3 implements DC5V {
    private ACV acv;
    public Adapter3(ACV_220V ac220V3) {
        this.acv = ac220V3;
    }
    public Adapter3(ACV_110V ac110V3) {
        this.acv = ac110V3;
    }
    @Override
    public int dc5v() {
        int ac = 0;
        if (acv != null) {
            ac = acv.input();
        }
        int sta = ac / 5;
        return (ac / sta);
    }
}
