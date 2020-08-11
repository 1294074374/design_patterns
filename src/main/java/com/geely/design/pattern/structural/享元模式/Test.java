package com.geely.design.pattern.structural.享元模式;

import java.util.Random;

/**
 * 享元模式
 * 定义：
 *      1.提供了减少对象数量从而改善应用所需的对象结构的方式
 *      2.运用共享技术有效地支持大量细粒度的对象
 * 类型：
 *      1.结构型
 * 适用场景：
 *      1.常常应用于系统底层的开发，以便解决系统的x性能问题
 *      2.系统有大量的相似对象，需要缓冲池的场景
 * 优点：
 *      1.减少d对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
 *      2.减少内存之外的其他资源占用（时间/操作系统的文件句柄，窗口句柄）
 * 缺点：
 *      1.关注内/外部状态，关注线程安全问题（HashMap）
 *      2.使系统程序的逻辑复杂化
 * 扩展：
 *      1.内部状态
 *          不会随环境的改变而改变
 *      2.外部状态
 *          会随环境的改变而改变
 * 相关设计模式
 *      1.享元模式和代理模式
 *          享元模式：管理类
 *          代理模式：代理类
 *      2.享元模式和单例模式
 *          享元模式：服用同一个对象的思想
 *          单例模式：容器单例
 * 源码
 *      1.JDK
 *          java.lang.Integer.valueOf()
 *          java.lang.Long.valueOf()
 *      2.JDBC 连接池
 *          org.apache.commons.pool2.impl.GenericObjectPoolConfig
 */
public class Test {
    private static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            String department = departments[(int) (i % departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
