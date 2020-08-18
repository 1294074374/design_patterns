package com.geely.design.pattern.behavioral.状态模式;

public abstract class CourseVideoState {
    protected  CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract  void play();
    public abstract  void speed();
    public abstract  void pause();
    public abstract  void stop();
}
