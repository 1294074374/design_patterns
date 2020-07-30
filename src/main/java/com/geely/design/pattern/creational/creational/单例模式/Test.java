package com.geely.design.pattern.creational.creational.单例模式;


import com.geely.design.pattern.creational.creational.单例模式.饿汉式.HungrySingleton;

import java.io.*;

/**
 * 单例模式
 *
 * 定义与类型
 * 定义
 *      保证一个类只有一个实例，并提供一个全局访问点
 * 类型
 *      创建型
 * 适用场景
 *      想保证任何情况下都绝对只有一个实例（譬如：网站的计数器；文件的读取类；线程池；数据库连接池）
 * 优点
 *      1.内存中只有一个实例，减少内存开销
 *      2.可以避免对内存的多重占用
 *      3.设置全局访问点，严格控制访问
 * 缺点
 *      1.没有接口，扩展困难
 * 重点
 *      1.私有构造器：禁止外部类调用构造函数创建对象
 *      2.线程安全：所有线程拿到的实例是同一个
 *      3.延迟加载：使用它时才创建
 *      4.序列化和反序列化安全：（面试加分项）
 *          Java序列化就是指把Java对象转换为字节序列的过程
 *          Java反序列化就是指把字节序列恢复为Java对象的过程。
 *      5.反射（面试加分项）
 *
 * 破坏单例模式（面试加分）
 *      1.序列化和反序列化
 *
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 测试序列化破坏单例模式
        checkSerializable();


    }

    private static void checkSerializable() throws IOException, ClassNotFoundException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //序列化并写出文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hungrySingleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        //反序列化
        HungrySingleton newHungrySingleton = (HungrySingleton) ois.readObject();

        System.out.println(hungrySingleton);
        System.out.println(newHungrySingleton);
        System.out.println(hungrySingleton == newHungrySingleton);
    }
}
