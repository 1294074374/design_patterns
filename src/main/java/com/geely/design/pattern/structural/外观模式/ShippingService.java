package com.geely.design.pattern.structural.外观模式;

public class ShippingService {
    public String shippingGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
