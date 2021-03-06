package com.geely.design.pattern.structural.代理模式;

/**
 * 代理模式
 * 定义：
 *      1.为其他对象提供一种代理，以控制对这个对象的访问
 *      2.代理对象在客户端和目标对象之间处于中介的作用
 * 类型：
 *      1.结构型
 * 适用场景：
 *      1.保护目标对象
 *      2.增强目标对象
 * 优点：
 *      1.代理模式能将代理对象与真实被调用的目标对象分离
 *      2.一定程度上降低了系统的耦合度，扩展性好
 *      3.保护对象
 *      4.增强对象
 * 缺点：
 *      1.代理模式会造成系统设计中类数目增加
 *      2.在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
 *      3.增加系统复杂度
 * 扩展：
 *      1.静态代理
 *          由程序员创建代理类或特定工具自动生成源代码再对其编译。在程序运行前代理类的.class文件就已经存在了。
 *          通过在代码中显式地定义了一个业务实现类的代理，在代理类中对同名的代理方法进行了包装，通过调用代理类中
 *          包装过的方法去调用目标类中的对应方法。从而对业务进行增强
 *      2.动态代理
 *          在程序运行时运用反射机制动态创建而成。(InvocationHandler 的应用)
 *          通过接口中的方法名在动态生成的代理类中调用业务实现类的同名方法
 *      3.CGLib代理
 *          生成子类代理
 *          通过继承实现，生成的代理类是业务类的子类。通过重写业务方法进行代理
 * Spring的代理选择
 *      1.当bean有实现接口时，Spring就会用JDK的动态代理
 *      2.当bean没有实现接口时，Spring会使用CGLib代理
 *      3.可以强制使用CGLib代理，在spring的配置文件中加入<aop:aspectj-autoproxy proxy-target-class="true"/>
 * 代理速度对比：
 *      1.CGLib
 *      2.JDK动态代理
 * 相关设计模式：
 *      1.代理模式和装饰者模式
 *          代理模式：控制访问，增强目标对象
 *          装饰者模式:为对象添加行为
 *      2.代理模式和适配器模式
 *          代理模式：不能改变代理对象的接口
 *          适配器模式：需要考虑目标对象的接口
 * 源码：
 *      1.JDK
 *          java.lang.reflect
 *      2.Spring
 *          org.springframework.aop.framework.ProxyFactoryBean
 *          org.springframework.aop.framework.JdkDynamicAopProxy
 *      3.myBatis
 *          org.apache.ibatis.binding.MapperProxyFactory
 *
 *
 */
public class Test {
    public static void main(String[] args) {

    }
}
