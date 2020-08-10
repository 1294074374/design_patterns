package com.geely.design.pattern.structural.装饰者模式;

import org.apache.ibatis.cache.TransactionalCacheManager;
import org.springframework.cache.transaction.TransactionAwareCacheDecorator;

/**
 *
 * 装饰者模式
 * 定义：
 *      1.在不改变原有对象的基础之上，将功能附加到对象上
 *      2.提供了比继承更有弹性的替代方案（扩展原有对象的功能）
 * 类型：
 *      1.结构型
 * 适用场景：
 *      1.扩展一个类的功能或者给一个类添加附加职责
 *      2.动态给一个对象添加功能，这些功能也可以动态的撤销
 * 优点：
 *      1.继承的有力补充，比继承灵活，在不改变对象的情况下给一个对象扩展功能
 *      2.通过不同的装饰类以及这些装饰类的排列组合，可以实现不同的效果
 *      3.符合开闭原则
 * 缺点：
 *      1.会出现更多代码，更多的类，增加程序复杂性
 *      2.动态装饰，多层装饰时会更复杂
 * 相关设计模式
 *      1.装饰着模式和代理模式
 *      2.装饰者模式和适配器模式
 * 源码：
 *      JDK：
 *          1.java.io.BufferReader
 *          2.java.io.BufferInputStream
 *          3.java.io.BufferOutStream
 *      Spring:
 *          1.org.springframework.cache.transaction.TransactionAwareCacheDecorator
 *          2.org.springframework.session.web.http.SessionRepositoryRequestWrapper
 *          3.org.springframework.session.web.http.SessionRepositoryResponseWrapper
 *
 *
 */

public class Test {
    public static void main(String[] args) {
    }
}
