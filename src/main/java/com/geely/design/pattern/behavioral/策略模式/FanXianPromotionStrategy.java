package com.geely.design.pattern.behavioral.策略模式;

public class FanXianPromotionStrategy  implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存储在慕课网用户余额中");
    }
}
