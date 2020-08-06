package com.geely.design.pattern.creational.单例模式.双重检测;

public class MyThread implements Runnable {

    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + lazyDoubleCheckSingleton);
    }
}
