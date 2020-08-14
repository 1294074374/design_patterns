package com.geely.design.pattern.behavioral.迭代器模式;

public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);
    CourseIterator getCourseIterator();

}
