package com.geely.design.pattern.behavioral.策略模式;


/**
 * 策略模式
 * 定义：
 *      1.定义了算法家族，并分别封装起来，让他们之间可以互相替换，此模式让算法的变化不会影响到使用该算法的用户
 * 类型：
 *      1.行为型
 * 适用场景
 *      1.系统有很多类，它们之间的不同仅仅是它们的行为不同
 *      2.一个系统需要动态地在几个算法中选择一种
 * 优点:
 *      1.符合开闭原则
 *      2.避免使用多重条件转移语句
 *      3.提高算法的保密性和安全性
 * 缺点：
 *      1.客户端必须知道所有的策略类型，并自行决定使用哪一种策略类
 *      2.产生很多策略类
 * 相关设计模式：
 *      1.模板方法设计模式和策略设计模式
 *          模板方法设计模式：定义一套算法流程，由子类实现
 *          策略设计模式：可以是不同的算法相互替换，不影响客户端的调用
 *      2.策略模式和工厂模式
 *      3.策略模式和状态模式
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        PromotionStrategyActivity fanXianPromotionStrategy = new PromotionStrategyActivity(new FanXianPromotionStrategy());
        PromotionStrategyActivity liJianPromotionStrategy = new PromotionStrategyActivity(new LiJianPromotionStrategy());
        PromotionStrategyActivity manJianPromotionStrategy = new PromotionStrategyActivity(new ManJianPromotionStrategy());

        fanXianPromotionStrategy.executePromotionStrategy();
        liJianPromotionStrategy.executePromotionStrategy();
        manJianPromotionStrategy.executePromotionStrategy();
    }
}
