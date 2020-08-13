package com.geely.design.pattern.structural.代理模式.静态代理;

import com.geely.design.pattern.structural.代理模式.IOrderService;
import com.geely.design.pattern.structural.代理模式.Order;
import com.geely.design.pattern.structural.代理模式.OrderServiceImpl;
import com.geely.design.pattern.structural.代理模式.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    private void beforeMethod() {
        System.out.println("静态代理 beforeCode");
    }

    int saveOrder(Order order) {
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;

        // 设置DataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
        afterMethod();
        return iOrderService.saveOrder(order);
    }


    private void afterMethod() {
        System.out.println("静态代理 afterCode");
    }


}
