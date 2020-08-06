package com.geely.design.pattern.creational.单例模式.饿汉式;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
    // final 在类加载时必须赋值
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    // 防止反序列化破坏单例模式
    private Object readResolve(){
        return hungrySingleton;
    }
}
