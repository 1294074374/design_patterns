package com.geely.design.pattern.behavioral.观察者模式;


import java.util.Observable;
import java.util.Observer;

/**
 * 实现Observer的类为真正的观察者
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }


    /***
     *
     * @param o 被观察者的对象
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName()
                + "课程接收到一个" + question.getUserName()
                + "提出的问题:" + question.getQuestionContent());
    }
}
