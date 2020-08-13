package com.geely.design.pattern.behavioral.模板方法模式;

public class FECourse extends ACourse{
    private boolean needWriteArticle;

    public FECourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体课程");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticle;
    }

}
