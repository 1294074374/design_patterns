package com.geely.design.pattern.structural.适配器模式.对象适配器模式;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }
}
