package com.geely.design.pattern.structural.代理模式.静态代理;

import com.geely.design.pattern.structural.代理模式.Order;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        // 代理类
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
