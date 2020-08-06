package com.geely.design.pattern.creational.单例模式.容器;


public class MyThread implements Runnable {

    @Override
    public void run() {
        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
