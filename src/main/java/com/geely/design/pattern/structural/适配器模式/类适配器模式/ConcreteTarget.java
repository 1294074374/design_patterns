package com.geely.design.pattern.structural.适配器模式.类适配器模式;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget的目标方法");
    }
}
