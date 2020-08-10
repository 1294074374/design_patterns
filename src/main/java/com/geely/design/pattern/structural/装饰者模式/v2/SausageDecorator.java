package com.geely.design.pattern.structural.装饰者模式.v2;

public class SausageDecorator extends AbstractDecorator{

    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    protected String cost() {
        return super.cost()+"+2元";
    }
}

