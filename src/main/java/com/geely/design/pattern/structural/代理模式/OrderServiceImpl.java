package com.geely.design.pattern.structural.代理模式;

public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        iOrderDao.insert(order);
        System.out.println("Service层调用Dao层添加order");
        return iOrderDao.insert(order);
    }
}
