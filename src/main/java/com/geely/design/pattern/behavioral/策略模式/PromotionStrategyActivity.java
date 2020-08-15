package com.geely.design.pattern.behavioral.策略模式;

public class PromotionStrategyActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionStrategyActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
         this.promotionStrategy.doPromotion();
    }
}
