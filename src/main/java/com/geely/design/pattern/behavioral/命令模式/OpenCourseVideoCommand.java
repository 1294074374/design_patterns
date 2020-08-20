package com.geely.design.pattern.behavioral.命令模式;

public class OpenCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
