package com.geely.design.pattern.behavioral.责任链模式;

public abstract class Approver {
    protected Approver approver;

    public void nextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);

}
