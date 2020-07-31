package com.geely.design.pattern.creational.creational.单例模式.容器;


/**
 * 容器单例模式（类似享元模式）
 *
 * 通过一个容器来维持对象实例的唯一性
 * (可用容器：HashMap,HashTable可以保证线程安全，但同步锁会影响性能,ConcurrentMap（线程安全，内部为分段式锁）)
 *
 * 优点：可以管理多个单例
 * 缺点：线程不安全
 *
 */
public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        thread1.start();
        thread2.start();
        System.out.println("运行结束");
    }
}
