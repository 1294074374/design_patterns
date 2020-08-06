package com.geely.design.pattern.creational.建造者模式;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    //课程的问题和答案
    private String courseQA;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Course{");
        sb.append("courseName='").append(courseName).append('\'');
        sb.append(", coursePPT='").append(coursePPT).append('\'');
        sb.append(", courseVideo='").append(courseVideo).append('\'');
        sb.append(", courseArticle='").append(courseArticle).append('\'');
        sb.append(", courseQA='").append(courseQA).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }
}
