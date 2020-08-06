package com.geely.design.pattern.structural.外观模式;

public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+ pointsGift.getName()+" 积分校验通过，库存校验通过");
        return true;
    }
}
