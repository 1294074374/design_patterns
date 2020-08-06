package com.geely.design.pattern.creational.creational.原型模式;

import java.util.ArrayList;

/**
 * 原型模式
 *
 * 定义：
 *      1.原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 *      2.不需要知道任何创建细节，不调用构造函数
 * 类型：
 *      1.创建型
 * 使用场景：
 *      1.类初始化消耗较多资源
 *      2.new产生一个对象需要非常繁琐的过程（数据准备、访问权限等）
 *      3.构造函数比较复杂
 *      4.循环体中产生大量对象时
 * 优点：
 *      1.比直接new一个对象的性能要高
 *      2.简化创建过程
 * 缺点：
 *      1.必须配备克隆方法 Object.clone() (浅拷贝) 实现Cloneable 接口才能被拷贝
 *      2.对克隆复杂对象或对克隆出的对象进行复杂改造时，容易引入风险
 *      3.深拷贝和浅拷贝运用得当
 * 扩展
 *      1.深克隆
 *          对当前层次的所有引用对象进行再次克隆
 *
 *      2.浅克隆
 *          只克隆当前层次的对象，对当前层次对象中包含对象型属性仍是同一个对象。
 * 源码(实现了Cloneable接口的都有可能是原型模式)
 *      1.JDK
 *          java.util.ArrayList
 *
 * 在内存中将对象以二进制流的方式进行拷贝
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            // 克隆对象
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@imooc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
