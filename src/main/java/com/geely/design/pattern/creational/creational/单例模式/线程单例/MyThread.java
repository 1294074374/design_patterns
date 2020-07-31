package com.geely.design.pattern.creational.creational.单例模式.线程单例;


public class MyThread implements Runnable {

    @Override
    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
