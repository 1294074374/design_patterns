package com.geely.design.pattern.behavioral.中介者模式;

/**
 * 中介者模式
 * 定义：
 *      1.定义一个封装一组对象如何交互的对象
 *      2.通过使对象明确地相互引用来促进松散耦合，并允许独立地改变他们之间的交互
 * 类型：
 *      1.行为型
 * 使用场景：
 *      1.系统中对象之间存在复杂的引用关系，产生相互依赖关系结构混乱且难以理解
 *      2.交互的公共行为，如果需要改变行为则可增加新的中介者类
 * 优点：
 *      1.将一对多转化成了一对一、降低了程序复杂度
 *      2.类之间解耦
 * 缺点：
 *      1.中介者过多，导致系统哦更复杂
 * 相关设计模式：
 *      1.中介者模式和观察者模式
 *
 */
public class Test {
    public static void main(String[] args) {
        User test = new User("Test");
        User tom = new User("Tom");

        test.sendMessage("I am test");
        tom.sendMessage("I am tom");
    }
}
