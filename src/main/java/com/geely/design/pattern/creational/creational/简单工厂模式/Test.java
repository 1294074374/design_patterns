package com.geely.design.pattern.creational.creational.简单工厂模式;


/**
 * 定义和类型
 * 定义：由一个工厂对象去决定创建出哪一种产品类的实例
 * 类型：创建型，但不属于GOF23种设计类型
 * <p>
 * 适用场景
 * 1.工厂类负责创建的对象比较少
 * 2.客户端(应用层)只知道传入工厂类的参数对于如何创建对象(逻辑)并不关心
 * <p>
 * 优点
 * 1.只需传入参数，就可获取想要的对象。无需关心创建的实现逻辑
 * <p>
 * 缺点
 * 1.工厂类责任过重，增加新产品时需要修改工厂类的判断逻辑，违背k开闭原则
 *
 * coding例子
 * JDK：
 *      1.Calendar.getInstance()
 * LoggerFactory:
 *      1.getLogger();
 */

public class Test {
    public static void main(String[] args) {
        // 创建工厂
        VideoFactory videoFactory = new VideoFactory();
        // 生产对象
        Video video = videoFactory.getVideo(PythonVideo.class);
        // 判空
        if (video == null) {
            return;
        }
        video.product();



        // 创建工厂
        VideoFactory videoFactory1 = new VideoFactory();
        // 生产对象
        Video video1 = videoFactory.getVideo("python");
        // 判空
        if (video == null) {
            return;
        }
        video.product();
    }

}
