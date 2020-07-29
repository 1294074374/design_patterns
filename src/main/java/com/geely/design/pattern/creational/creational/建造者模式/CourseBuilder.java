package com.geely.design.pattern.creational.creational.建造者模式;

public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    // 建造实体类
    public abstract Course makeCourse();
}
