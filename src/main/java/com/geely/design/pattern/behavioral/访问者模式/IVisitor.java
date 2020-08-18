package com.geely.design.pattern.behavioral.访问者模式;

public interface IVisitor {
     void visit(FreeCourse course);
     void visit(CodingCourse course);
}
