package com.geely.design.pattern.behavioral.访问者模式;

public class FreeCourse extends  Course{

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
