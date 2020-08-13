package com.geely.design.pattern.structural.代理模式;

public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加order成功");
        return 1;
    }
}
