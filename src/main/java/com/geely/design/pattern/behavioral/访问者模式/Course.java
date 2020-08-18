package com.geely.design.pattern.behavioral.访问者模式;



public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor iVisitor);
}
