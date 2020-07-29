package com.geely.design.pattern.creational.creational.建造者模式;


/**
 * 建造者模式
 * 定义与类型
 * 定义：
 *      1.将一个复杂的对象构建和它的表示分离，使得同样的构建过程可以创建不同的表示
 *      2.用户只需指定需要建造的类型就可以得到它们，建造过程和细节无需知道
 * 类型：创建型
 *
 * 适用场景
 *      1.如果一个对象有非常复杂的内部结构(很多属性)
 *      2.想把复杂对象的创建和使用分离
 *
 * 优点
 *      1.封装性好，创建和使用分离
 *      2.扩展性好、建造性之间独立、一定程度上解耦
 *
 * 缺点
 *      1.产生多余的builder对象
 *      2.产品内部发生变化，建造者都要修改，成本较大
 *
 * 源码
 *      1.JDK
 *          StringBuilder.append()不同步
 *          StringBuffer.append() 同步
 *      2.guava
 *          ImmutableSet.add()
 *          ImmutableSet.copyOf()
 *          TokenCache.builder()
 *      3.spring
 *          BeanDefinitionBuilder
 *      4.mybatis
 *          SqlSessionFactoryBuilder.builder()
 *          XMLConfigBuilder.parseConfiguration()
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java设计模式精讲",
                "java设计模式精讲.ppt",
                "java设计模式精讲.avi",
                "java设计模式精讲.word",
                "java设计模式精讲问答题.word"
                );
        System.out.println(course.toString());
    }
}
