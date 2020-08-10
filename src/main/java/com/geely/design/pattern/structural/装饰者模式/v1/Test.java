package com.geely.design.pattern.structural.装饰者模式.v1;

/**
 * 纯继承
 *
 * 如果想买两个鸡蛋的情况 需要新增类
 *
 * 容易发生类爆炸现象
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc()+" 价格"+batterCake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc()+" 价格"+batterCakeWithEgg.cost());

        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc()+" 价格"+batterCakeWithEggSausage.cost());
    }
}
