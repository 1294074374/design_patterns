package com.geely.design.pattern.behavioral.观察者模式;

/**
 * 观察者模式
 * 定义：
 *      1.定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 类型：
 *      1.行为型
 * 适用场景：
 *      1.关联行为场景，建立一套触发机制
 * 优点：
 *      1，观察者和被观察者之间建立了一个抽象的耦合
 *      2.观察者模式支持广播通信
 * 缺点：
 *      1.观察者之间有过多的细节依赖、提高时间消耗以及程序复杂度
 *      2.使用要得当，避免循环调用
 *
 */
public class Test {
    public static void main(String[] args) {
        Course course= new Course("java设计模式");
        Teacher teacher = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Caesar");
        // 添加观察者
        course.addObserver(teacher);
        course.addObserver(teacher2);
        //业务逻辑代码
        Question question = new Question();
        question.setUserName("test");
        question.setQuestionContent("如何找到女朋友");

        course.productQuestion(course,question);
    }
}
