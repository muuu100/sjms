package com.company.VisitorMS.demo1;

public class VisitorCTO implements Visitor {
    @Override
    public void visit(ElementEngineer ea) {
        System.out.println("考核工程师代码量：" + ea.getCodeLines());
    }

    @Override
    public void visit(ElementManager eb) {
        System.out.println("考核经理产品量：" + eb.getProductCount());
    }
}
