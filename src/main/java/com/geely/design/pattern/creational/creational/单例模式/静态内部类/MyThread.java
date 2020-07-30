package com.geely.design.pattern.creational.creational.单例模式.静态内部类;

import com.geely.design.pattern.creational.creational.单例模式.双重检测.LazyDoubleCheckSingleton;
import org.aspectj.apache.bcel.classfile.InnerClass;

public class MyThread implements Runnable {

    @Override
    public void run() {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
