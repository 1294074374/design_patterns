package com.geely.design.pattern.structural.外观模式;

public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("支付"+pointsGift.getName()+"积分成功");
        return true;
    }

}
