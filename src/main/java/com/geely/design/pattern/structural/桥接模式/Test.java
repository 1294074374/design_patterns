package com.geely.design.pattern.structural.桥接模式;

/**
 * 桥接模式
 * 定义：
 *      1.将抽象部分和它的具体实现部分分离，使它们都可以独立地变化
 *      2.通过组合的方式建立两个类之间的联系，不是继承
 * 类型：
 *      1.结构型
 * 适用场景
 *      1.抽象和具体实现之间增加更多的灵活性
 *      2.一个类存在两个或多个独立变化的维度，且这两个或多个维度都需要独立进行扩展
 *      3.不希望使用继承，或因为多层继承导致系统类的个数剧增
 * 优点：
 *      1.分离抽象部分和具体实现部分（解耦）
 *      2.提高系统的可扩展性
 * 缺点：
 *      1.增加系统的理解和设计难度
 *      2.需要正确地识别出系统中两个独立变化的维度
 * 相关设计模式：
 *      1.桥接模式和组合模式
 *          桥接模式：强调平行级别上不同类的组合
 *          组合模式：强调部分和整体之间的组合
 *      2.桥接模式和适配器模式
 *          共同点：都是让两个模块配合工作
 *          桥接模式：分离抽象和实现
 *          适配器模式：改变已有的接口
 * 源码：
 *      1.jdbc
 *          com.mysql.jdbc.Driver
 *      2.JDK
 *          java.sql.DriverManager
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
