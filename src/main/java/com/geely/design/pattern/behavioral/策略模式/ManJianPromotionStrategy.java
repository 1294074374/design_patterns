package com.geely.design.pattern.behavioral.策略模式;

public class ManJianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("满减促销，课程的价格满减");
    }
}
