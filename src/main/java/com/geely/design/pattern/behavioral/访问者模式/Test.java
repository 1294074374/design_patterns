package com.geely.design.pattern.behavioral.访问者模式;


import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 * 定义：
 *      1.封装某种数据结构（如list,map,set等）中的各元素的操作
 *      2.可以在不改变各元素的类的前提之下，定义作用于这些元素的操作
 * 适用场景
 *      1.数据结构与数据操作分离
 * 优点：
 *      1.增加新的操作很容易，即增加一个新的访问者
 * 缺点：
 *      1.增加新的数据结构困难
 *      2.具体元素变更比较困难
 * 相关设计模式
 *      1.访问者模式和迭代器模式
 */
public class Test {
    public static void main(String[] args) {
        List<Course> list = new ArrayList();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("免费");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setPrice("123");
        codingCourse.setName("收费");

        list.add(freeCourse);
        list.add(codingCourse);

        for (Course course : list){
            course.accept(new Visitor());
        }
    }
}
