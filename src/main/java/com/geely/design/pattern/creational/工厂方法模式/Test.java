package com.geely.design.pattern.creational.工厂方法模式;

import org.slf4j.LoggerFactory;

import java.net.URLStreamHandlerFactory;

/**
 * 工厂方法模式
 * 定义和类型
 * 定义：定义一个创建对象的接口，但让实现这个接口类的对象来决定实例化哪个类，工厂方法模式是让类的实例化推迟到子类中进行
 * 类型：创建型
 *
 * 适用场景
 * 1.创建对象需要大量重复代码
 * 2.客户端(应用层)不依赖于产品实例如何去创建、实现等细节
 * 3.一个类通过其子类来指定创建哪个对象
 *
 * 优点
 * 1.用户只需要关心产品对应的工厂，无需关心产品创建细节
 * 2.加入产品符合开闭原则，提高扩展性
 *
 * 缺点
 * 1.类的个数过多容易增加复杂度
 * 2.增加了系统的抽象性和理解难度
 *
 * 例子
 * JDK：
 *      1.Collection.iterator()
 *      2.URLStreamHandlerFactory
 *      3.LoggerFactory.getLogger()
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();
    }
}
