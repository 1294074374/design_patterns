package com.geely.design.pattern.structural.外观模式;

public class GiftExchangeService {
    private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShippingService shippingService;


    public void giftExchange(PointsGift pointsGift){

        // 兑换资格校验
        if(qualifyService.isAvailable(pointsGift)){
            // 积分校验
            if(pointsPaymentService.pay(pointsGift)){
                // 生成物流订单号
                String shippingOrderNo = shippingService.shippingGift(pointsGift);
                System.out.println("物流下单成功订单号是"+shippingOrderNo );
            }
        }
    }

    public QualifyService getQualifyService() {
        return qualifyService;
    }

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public PointsPaymentService getPointsPaymentService() {
        return pointsPaymentService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public ShippingService getShippingService() {
        return shippingService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }
}
