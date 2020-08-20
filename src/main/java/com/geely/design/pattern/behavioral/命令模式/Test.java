package com.geely.design.pattern.behavioral.命令模式;

/**
 * 命令模式
 * 定义：
 *      1.将请求封装成对象，以便使用不同的请求
 *      2.命令模式解决了应用程序中对象的职责以及它们之间的通信方式
 * 类型：
 *      1.行为型
 * 适用场景：
 *      1.请求的调用者和请求的接受者需要解耦，使得调用者和接受者不直接交互。
 *      2.需要抽象出等待执行的行为
 * 优点：
 *      1.降低耦合
 *      2.容易扩展新命令或者一组命令
 * 缺点:
 *      1.命令的无限扩展会增加类的数量，提高系统的复杂度
 * 相关设计模式：
 *      1.命令模式和备忘录模式
 *
 */
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo  = new CourseVideo("Java设计模式");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);

        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
