package com.geely.design.pattern.creational.creational.单例模式.双重检测;

/**
 *
 */
public class LazyDoubleCheckSingleton {
    // 唯一实例
    // volatile：在对象创建过程中禁止JVM重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    // 构造方法私有，不允许外部类直接调用
    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    /**
                     * 重排序 2和3可能会调换
                     * 1.分配内存给对象
                     * 2.初始化对象
                     * 3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                     *
                     *  intra--thread semantics
                     *
                     *  假如发生重排序
                     * 1.分配内存给对象
                     * 3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                     * 2.初始化对象
                     *
                     * 线程0在给lazyDoubleCheckSingleton分配内存并指向内存地址时，初始化对象还没完成
                     * 线程1在此时判断lazyDoubleCheckSingleton是否为空，返回true,使得线程1访问到一个未初始化的对象，
                     * 从而导致系统报错
                     *
                     * 解决方法：
                     *      1.在类加载过程中不允许重排序
                     *      在lazyDoubleCheckSingleton定义时加上volatile关键字
                     *      （volatile：在对象创建过程中禁止JVM重排序，保证内存的可见性）
                     *
                     *
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
