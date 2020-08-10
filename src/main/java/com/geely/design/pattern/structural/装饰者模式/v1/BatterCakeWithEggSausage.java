package com.geely.design.pattern.structural.装饰者模式.v1;

public class BatterCakeWithEggSausage extends BatterCakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    public String cost() {
        return super.cost()+"+2元";
    }
}
