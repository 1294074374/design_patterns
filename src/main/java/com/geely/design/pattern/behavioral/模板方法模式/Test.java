package com.geely.design.pattern.behavioral.模板方法模式;

/**
 * 模板设计模式模式
 * 定义：
 *      1.定义一个操作中的算法的骨架，并且允许子类为一个或多个步骤提供实现
 *      2.模板方法使得子类可以在不变算法结构的情况下，重新定义算法的某些步骤
 * 类型：
 *      1.行为型
 * 使用场景：
 *      1.一次性实现算法的不变部分，并将可变的行为留给子类来实现
 *      2.各子类中公共的行为被提取出来并集中到一个公共父类中，从而避免代码重复
 *  优点：
 *      1.提高复用性
 *      2.提高扩展性
 *      3.符合开闭原则
 *  缺点：
 *      1.类数目的增加
 *      2.增加了系统实现的复杂度
 *      3.继承关系的缺点，如果父类添加新的抽象方法，所有子类都要改一遍
 *  扩展：
 *      1钩子方法：
 *          提供缺省行为
 * 相关设计模式：
 *      1.模板方法设计模式和工厂方法设计模式
 *          模板方法设计模式
 *          工厂方法设计模式：是模板方法设计模式的一种特殊实现形式
 *      1.模板方法设计模式和策略设计模式
 *          模板方法设计模式：定义一套算法流程，由子类实现
 *          策略设计模式：可以是不同的算法相互替换，不影响客户端的调用
 * 源码：
 *      1.JDK
 *          AbstractList
 *          AbstractSet
 *          AbstractMap
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start --");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end --");
        System.out.println("----------");
        System.out.println("前端start --");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端end --");
    }
}
