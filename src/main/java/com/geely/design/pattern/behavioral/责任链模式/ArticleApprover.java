package com.geely.design.pattern.behavioral.责任链模式;


public class ArticleApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if(course.getArticle() != null && !"".equals(course.getArticle())){
            System.out.println(course.getArticle()+"已有手记，批准");
            if(super.approver!=null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getArticle()+"没有手记，不批准流程介绍");
            return;
        }
    }
}
