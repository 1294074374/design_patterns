package com.geely.design.pattern.behavioral.责任链模式;

public class Course {
    private String name;
    private String article;
    private String video;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Course{");
        sb.append("name='").append(name).append('\'');
        sb.append(", article='").append(article).append('\'');
        sb.append(", video='").append(video).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
