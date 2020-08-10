package com.geely.design.pattern.structural.装饰者模式.v2;

public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected String cost() {
        return super.cost() + "+1元";
    }
}
