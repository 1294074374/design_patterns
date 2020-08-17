package com.geely.design.pattern.behavioral.观察者模式;

import com.geely.design.pattern.structural.外观模式.QualifyService;

import java.util.Observable;

/**
 * 继承Observable的类就成为被观察对象
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    /***
     *
     * @param course 被观察者
     * @param question 观察者
     */
    public void productQuestion(Course course, Question question){
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"上提供的问题");
        //Observable中改变状态的方法
        setChanged();
        notifyObservers(question);
    }
}
