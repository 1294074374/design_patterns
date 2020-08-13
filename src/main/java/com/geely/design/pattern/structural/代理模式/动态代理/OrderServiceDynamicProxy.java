package com.geely.design.pattern.structural.代理模式.动态代理;


import com.geely.design.pattern.structural.代理模式.Order;
import com.geely.design.pattern.structural.代理模式.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        // 动态代理的核心
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    /***
     *
     * @param proxy     动态生成的代理类  很少用到
     * @param method    需要增强的方法对象
     * @param args      method具体参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }


    private void beforeMethod(Object object) {
        int userId = 0;

        System.out.println("动态代理 before code");
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();

            int dbRouter = userId % 2;
            System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

            //todo 设置dataSource;
            DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        }
    }

    private void afterMethod() {
        System.out.println("动态代理: after code");
    }

}
