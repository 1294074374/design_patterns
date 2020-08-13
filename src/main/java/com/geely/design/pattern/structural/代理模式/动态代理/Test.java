package com.geely.design.pattern.structural.代理模式.动态代理;


import com.geely.design.pattern.structural.代理模式.IOrderService;
import com.geely.design.pattern.structural.代理模式.Order;
import com.geely.design.pattern.structural.代理模式.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        // 代理类  增强接口的实现类OrderServiceImpl
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
       orderServiceDynamicProxy.saveOrder(order);
    }
}
