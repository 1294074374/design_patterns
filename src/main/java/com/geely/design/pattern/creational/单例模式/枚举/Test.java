package com.geely.design.pattern.creational.单例模式.枚举;

/**
 * 枚举类型的单例模式
 *
 * 类似饿汉式单例模式
 * 但不能被反射破解，因为反射机制不能创建枚举对象
 * Cannot reflectively create enum objects
 *
 * 经过反编译
 * 枚举类中的实例对象是定义为final的
 * 且在一个静态代码块中初始化
 * （类似饿汉式）
 */
public class Test {
    public static void main(String[] args) {
        EnumInstance enumInstance1 = EnumInstance.getInstance();
        EnumInstance enumInstance2 = EnumInstance.getInstance();
        enumInstance1.setData(new Object());
        System.out.println(enumInstance1.getData());
        System.out.println(enumInstance2.getData());
        System.out.println(enumInstance1);
        System.out.println(enumInstance2);
    }
}
