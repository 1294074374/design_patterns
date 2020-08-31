package com.geely.design.pattern.behavioral.责任链模式;

/**
 * 责任链模式（职责链模式）
 * 定义：
 *      1.为请求创建一个接受此请求对象的链
 * 类型：
 *      1.行为型
 * 适用场景：
 *      1.一个请求的处理需要多个对象中的一个或多个协作处理
 * 优点：
 *      1.请求的发送者和请求的接受者解耦
 *      2.责任链可以动态组合
 * 缺点：
 *      1.责任链太长或者处理时间过长，影响性能
 * 相关设计模式：
 *      1.责任链模式和状态模式
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("java设计模式");
        course.setArticle("设计模式手记");
        course.setVideo("设计模式视频");

        articleApprover.nextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
