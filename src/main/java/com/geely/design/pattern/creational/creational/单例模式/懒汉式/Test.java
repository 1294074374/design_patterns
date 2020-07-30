package com.geely.design.pattern.creational.creational.单例模式.懒汉式;

/**
 * 懒汉式
 *      注重延时加载，在使用的时候初始化，否则不会初始化
 *  解决多线程问题的方案
 *      1.创建实例的方法上加synchronized关键字 类锁
 *      2.将加载实体对象的代码块用synchronized锁住 对象锁
 *
 *      缺点：同步锁会消耗资源，加锁和开锁的资源开销
 *
 */
public class Test {

    public static void main(String[] args) {
        // LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("处理完成");
    }
}
