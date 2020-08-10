package com.geely.design.pattern.structural.适配器模式.对象适配器模式;


public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
