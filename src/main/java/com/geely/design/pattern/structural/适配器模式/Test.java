package com.geely.design.pattern.structural.适配器模式;

/**
 * 适配器模式
 * 定义：
 *      1.将一个类的接口（被适配接口）转换为客户期待的另一个接口（目标接口）
 *      2.使原本接口不兼容的类可以一起工作
 * 类型：
 *      1.结构型
 * 适用场景：
 *      1.已存在的类，它的方法和需求不匹配时（方法的结果相同或相似）
 *      2.不是软件设计阶段使用的设计模式，是随着软件维护，由于不同产品，不同厂家造成功能类似而接口不相同情况下的解决方案
 * 优点：
 *      1.能提高类的透明性和复用，现有的类复用但不需要改变
 *      2.目标类和适配器类解耦，提高程序可扩展性
 *      3.符合开闭原则
 * 缺点：
 *      1.适配器编写过程需要全面考虑，可能增加系统的复杂性
 *      2.增加代码的可读难度
 * 扩展：
 *      1.对象适配器（通过组合）
 *      2.类适配器（通过继承）
 * 相关设计模式：
 *      1.适配器模式和外观模式
 *  源码：
 *      1.JDK
 *          javax.xml.bind.annotation.adapters.XmlAdapter
 *      2.spring
 *          org.springframework.aop.framework.adapter.AdvisorAdapter
 *
 */
public class Test {
    public static void main(String[] args) {
        DC5 powerAdapter = new PowerAdapter();
        System.out.println("适配后的电压为"+powerAdapter.outputDC5V());
    }
}
