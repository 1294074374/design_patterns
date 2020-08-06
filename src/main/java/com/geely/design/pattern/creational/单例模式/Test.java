package com.geely.design.pattern.creational.单例模式;


import com.geely.design.pattern.creational.单例模式.懒汉式.LazySingleton;
import com.geely.design.pattern.creational.单例模式.枚举.EnumInstance;
import com.geely.design.pattern.creational.单例模式.静态内部类.StaticInnerClassSingleton;
import com.geely.design.pattern.creational.单例模式.饿汉式.HungrySingleton;
import org.apache.ibatis.executor.ErrorContext;
import org.springframework.beans.factory.config.AbstractFactoryBean;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
 *      2.反射
 *
 * 例子
 * JDK：
 *      1.java.lang.RunTime.getRunTime() 属于饿汉式
 *      2.java.awt.Desktop.getDesktop() 属于懒汉式，容器单例  有synchronize关键字同步
 * Spring（给予容器）
 *      1.org.springframework.beans.factory.config.AbstractFactoryBean.getObject() 属于懒汉式
 * iBatis
 *      1.org.apache.ibatis.executor.ErrorContext.instance()
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 测试序列化破坏单例模式
       // checkSerializable();

        // 反射共计破坏单例模式
        // checkReflect();

        // 枚举类型的序列化机制破解
        // checkEnumSerializable();

        // 枚举类型的反射机制破解
        checkEnumReflect();
    }

    private static void checkEnumReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = EnumInstance.class;
        // 获取构造器
        // 由于enum源码中 没有无参的构造器，只有一个string int的构造器，所以获取构造器的时候要添加参数
        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
        // 取消 Java 语言访问检查。private也可以访问
        constructor.setAccessible(true);

        EnumInstance newInstance = (EnumInstance) constructor.newInstance("123",666);
        // Cannot reflectively create enum
        // 无法通过反射进行构造枚举对象
        EnumInstance instance = EnumInstance.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    private static void checkEnumSerializable() throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        //序列化并写出文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        //反序列化
        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }

    private static void checkReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
         Class objectClass = HungrySingleton.class;
        // Class objectClass = StaticInnerClassSingleton.class;
        // Class objectClass = LazySingleton.class;
        // 获取构造器
        Constructor constructor = objectClass.getDeclaredConstructor();
        // 取消 Java 语言访问检查。private也可以访问
        constructor.setAccessible(true);

        // 懒加载 反射无法避免
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();

        //HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        //HungrySingleton instance = HungrySingleton.getInstance();

        // StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        // StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

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

/*        LazySingleton hungrySingleton = LazySingleton.getInstance();
        //序列化并写出文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hungrySingleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        //反序列化
        LazySingleton newHungrySingleton = (LazySingleton) ois.readObject();

        System.out.println(hungrySingleton);
        System.out.println(newHungrySingleton);
        System.out.println(hungrySingleton == newHungrySingleton);*/
    }
}
