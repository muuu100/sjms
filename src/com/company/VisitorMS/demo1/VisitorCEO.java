package com.company.VisitorMS.demo1;

public class VisitorCEO implements Visitor{
    @Override
    public void visit(ElementEngineer ea) {
        System.out.println("考核工程师" + ea.name + "kpi：" + ea.getKpi());
    }

    @Override
    public void visit(ElementManager eb) {
        System.out.println("考核经理" + eb.name + "kpi：" + eb.getKpi());
    }
}
