package com.geely.design.pattern.behavioral.命令模式;

public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void  open(){
        System.out.println(this.name+"课程视频开发");
    }
    public void close(){
        System.out.println(this.name+"课程视频关闭");
    }
}
