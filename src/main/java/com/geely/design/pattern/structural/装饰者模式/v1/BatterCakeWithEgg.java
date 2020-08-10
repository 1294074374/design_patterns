package com.geely.design.pattern.structural.装饰者模式.v1;

public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public String cost() {
        return super.cost() + "+1元";
    }


}
