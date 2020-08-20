package com.geely.design.pattern.behavioral.命令模式;

public class CloseCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }
    @Override
    public void execute() {
        courseVideo.close();
    }
}
