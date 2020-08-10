package com.geely.design.pattern.structural.装饰者模式.v2;

public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected String cost() {
        return "8元";
    }

}
