package com.geely.design.pattern.behavioral.状态模式;

/**
 * 状态模式
 * 定义：
 *      1.允许一个对象在其内部状态发生改变时，改变它的行为
 * 类型：
 *      1.行为型
 * 适用场景
 *      1.一个类存在多个状态（不同状态下行为不同），且状态可以互相转换
 * 优点：
 *      1.将不同的状态隔离
 *      2.将各种状态的转换逻辑，分布到State的子类中，减少相互依赖
 *      3.增加新的状态很简单
 * 缺点：
 *      1.状态多的业务场景导致类数目的增加，系统变复杂
 * 相关设计模式：
 *      1.状态模式和享元模式
 */
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        // 切换暂停状态
        courseVideoContext.pause();
        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        // 继续播放
        courseVideoContext.play();
        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        // 快进
        courseVideoContext.speed();
        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        // 停止
        courseVideoContext.stop();
        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
