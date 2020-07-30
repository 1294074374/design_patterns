package com.geely.design.pattern.creational.creational.单例模式.懒汉式;

/**
 *
 */
public class LazySingleton {
    // 唯一实例
    private static LazySingleton lazySingleton = null;

    // 构造方法私有，不允许外部类直接调用
    private LazySingleton() {
    }

    /**
     * 将整个静态方法用synchronized锁住 类锁
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

    /**
     * 将加载实体对象的代码块用synchronized锁住 对象锁
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        // 当线程调用时 创建当前的实体对象  往后调用的都是这次创建的实体对象
        // 延时加载
        synchronized (LazySingleton.class){
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

}
