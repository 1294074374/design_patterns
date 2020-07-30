package com.geely.design.pattern.creational.creational.单例模式.饿汉式;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
    // final 在类加载时必须赋值
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    // 反射
    private Object readResolve(){
        return hungrySingleton;
    }
}
