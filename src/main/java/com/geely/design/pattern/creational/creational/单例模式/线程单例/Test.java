package com.geely.design.pattern.creational.creational.单例模式.线程单例;

/**
 * 为每个线程提供一个单例
 * 实现线程隔离
 *
 * 用空间换时间 对于每一个线程都是唯一的单例
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("main " + ThreadLocalInstance.getInstance());
        System.out.println("main " + ThreadLocalInstance.getInstance());
        System.out.println("main " + ThreadLocalInstance.getInstance());
        System.out.println("main " + ThreadLocalInstance.getInstance());
        System.out.println("main " + ThreadLocalInstance.getInstance());
        System.out.println("main " + ThreadLocalInstance.getInstance());
        System.out.println("main " + ThreadLocalInstance.getInstance());
        System.out.println("main " + ThreadLocalInstance.getInstance());
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        thread1.start();
        thread2.start();
        System.out.println("运行结束");
    }
}
