package com.geely.design.pattern.behavioral.模板方法模式;

public abstract class ACourse {
    // 声明final 防止子类修改模板
    public final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            System.out.println("编写手记");
        }
        this.packageCourse();
    }

    // 算法固定部分都用final修饰 防止子类修改
    // 需要子类实现的就用protected
    // 可选可不选的就用钩子方法
    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("录制视频");
    }

    // 钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();


}
