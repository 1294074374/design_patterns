package com.geely.design.pattern.creational.creational.单例模式.懒汉式;

import com.geely.design.pattern.creational.creational.单例模式.饿汉式.HungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 *
 */
public class LazySingleton {
    // 唯一实例
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;

    // 构造方法私有，不允许外部类直接调用
    private LazySingleton() {
        if (flag) {
            // 当有线程访问时，设置为false  往后访问都抛出异常
            // 反射依然可以修改flag的值
            flag = false;
        } else {
            throw new RuntimeException("单例模式禁止反射调用");
        }
    }

    /**
     * 将加载实体对象的代码块用synchronized锁住 对象锁
     *
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        // 当线程调用时 创建当前的实体对象  往后调用的都是这次创建的实体对象
        // 延时加载
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

    /**
     * 将整个静态方法用synchronized锁住 类锁
     *
     * @return
     */
        /*public static synchronized LazySingleton getInstance() {
            // 当线程调用时 创建当前的实体对象  往后调用的都是这次创建的实体对象
            // 延时加载
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }*/
    public static void main(String[] args) throws Exception {
        Class objectClass = LazySingleton.class;
        // 获取构造器
        Constructor constructor = objectClass.getDeclaredConstructor();
        // 取消 Java 语言访问检查。private也可以访问
        constructor.setAccessible(true);
        LazySingleton instance = LazySingleton.getInstance();
        // 破解
        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance, true);
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
