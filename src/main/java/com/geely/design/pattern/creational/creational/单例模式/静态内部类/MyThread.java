package com.geely.design.pattern.creational.creational.单例模式.静态内部类;


public class MyThread implements Runnable {

    @Override
    public void run() {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
