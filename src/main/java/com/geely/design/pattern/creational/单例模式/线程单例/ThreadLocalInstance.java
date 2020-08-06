package com.geely.design.pattern.creational.单例模式.线程单例;

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance =
            new ThreadLocal<ThreadLocalInstance>() {
                // 重写初始化方法
                @Override
                protected ThreadLocalInstance initialValue() {
                    return new ThreadLocalInstance();
                }

            };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }
}
