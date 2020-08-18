package com.geely.design.pattern.behavioral.访问者模式;

public class CodingCourse extends  Course{
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
