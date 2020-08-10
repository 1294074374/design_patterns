package com.geely.design.pattern.structural.装饰者模式.v2;

/**
 * 装饰者模式
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc());
        System.out.println(aBatterCake.cost());
    }
}
