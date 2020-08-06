package com.geely.design.pattern.creational.单例模式.静态内部类;

/**
 * 类加载原理
 * 在线程加载类到类使用类的过程中，会添加Class对象的初始化锁
 *
 * 当线程0获得初始化锁时，线程1需要等待解锁才能使用。
 * 线程0对对象的内存变化，对线程1是不可见的
 *
 * 原理看 单例-静态内部类原理.png
 *
 * java语言规范中类加载立刻被初始化的情景（以A类为例）
 *      1.A类型的实例被创建
 *      2.A类中声明的一个静态方法被调用
 *      3.A类中声明的一个静态成员被赋值
 *      4.A类中声明的一个静态成员被使用并且这个静态成员不是常量
 *      5.如果A类是一个顶级类，且A类中有断言的嵌套语句，则A类会被立刻初始化
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

