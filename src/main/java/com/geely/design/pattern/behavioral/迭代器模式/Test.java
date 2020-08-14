package com.geely.design.pattern.behavioral.迭代器模式;

/**
 * 迭代器模式
 * 定义：
 *      1.提供一种方法，顺序访问一个集合对象中的各个元素，而又暴露该对象内部表示
 * 类型：
 *      1.行为型
 * 适用场景
 *      1、访问一个集合对象的内容而无需暴露他的内部表示
 *      2.为遍历不同的集合结构提供一个统一的接口
 * 优点：
 *      1.分离了集合对象的遍历行为
 * 缺点：
 *      1.类的个数成对增加
 * 相关设计模式：
 *      1.迭代器模式和访问者模式
 *          都是迭代地去访问一个集合对象
 *          迭代器模式：扩展开发部分在作用于集合对象的种类上
 *          访问者模式：扩展开发部分在作用于对象的操作上
 */
public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java设计模式精讲");
        Course course4 = new Course("Python课程");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");


        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("-----课程列表-----");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("-----删除操作之后的课程列表-----");
        printCourses(courseAggregate);
    }


    public static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }

}
