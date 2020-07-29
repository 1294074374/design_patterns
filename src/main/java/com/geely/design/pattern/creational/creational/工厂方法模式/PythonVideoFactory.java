package com.geely.design.pattern.creational.creational.工厂方法模式;

public class PythonVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
