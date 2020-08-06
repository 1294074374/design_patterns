package com.geely.design.pattern.creational.原型模式.clone;

import java.util.Date;

public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pig{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
