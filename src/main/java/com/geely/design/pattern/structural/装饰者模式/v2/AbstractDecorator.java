package com.geely.design.pattern.structural.装饰者模式.v2;

/**
 * 抽象装饰者
 */
public class AbstractDecorator extends ABatterCake{
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected String cost() {
        return this.aBatterCake.cost();
    }
}
