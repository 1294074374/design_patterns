package com.geely.design.pattern.creational.creational.工厂方法模式;

public class FEVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
