package com.geely.design.pattern.creational.抽象工厂模式;

import org.apache.ibatis.session.SqlSessionFactory;

/**
 * 抽象工厂模式
 * 定义与类型
 * 定义：抽象工厂模式提供一个创建一系列相关或者相互依赖对象的接口，无需指定它们的具体实现类
 * 类型：创建型
 *
 * 适用场景
 * 1.客户端不依赖于产品类实例如何去实现或者创建的细节
 * 2.强调一系列产品对象都属于同一产品族，创建对象时需要大量重复代码
 * 3.提供一个产品类的库，所有的产品以同样的方式出现，从而使客户端不依赖于具体实现
 *
 * 优点
 * 1.具体产品在应用层代码隔离，无需关心创建细节
 * 2.将同一系列的产品族统一到同一个工厂生产
 *
 * 缺点
 * 1.规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂接口
 * 2.增加了系统的抽象性和理解难度
 *
 * 源码
 * jdk:
 *      1.java.sql.Connection
 *      2.java.sql.Statement
 * mybatis
 *      1.SqlSessionFactory
 */

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.product();
        article.product();
    }
}
