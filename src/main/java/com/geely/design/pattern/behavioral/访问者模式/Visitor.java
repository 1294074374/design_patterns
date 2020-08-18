package com.geely.design.pattern.behavioral.访问者模式;

public class Visitor implements IVisitor{
    @Override
    public void visit(FreeCourse course) {
        System.out.println(course.getName());
    }

    @Override
    public void visit(CodingCourse course) {
        System.out.println(course.getName()+"--"+course.getPrice());
    }
}
