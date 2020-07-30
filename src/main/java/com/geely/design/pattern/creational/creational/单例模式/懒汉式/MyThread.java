package com.geely.design.pattern.creational.creational.单例模式.懒汉式;

public class MyThread implements Runnable {

    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + lazySingleton);
    }
}
