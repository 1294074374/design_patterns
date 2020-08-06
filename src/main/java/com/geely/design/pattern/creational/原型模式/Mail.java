package com.geely.design.pattern.creational.原型模式;

public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;

    public Mail(){
        System.out.println("Mail Class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mail{");
        sb.append("name='").append(name).append('\'');
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append('}').append(super.toString());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
