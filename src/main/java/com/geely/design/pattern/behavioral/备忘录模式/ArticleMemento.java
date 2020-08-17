package com.geely.design.pattern.behavioral.备忘录模式;

public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ArticleMemento{");
        sb.append("title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", imgs='").append(imgs).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
