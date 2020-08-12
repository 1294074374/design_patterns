package com.geely.design.pattern.structural.组合模式;

/**
 * 组合模式
 * 定义：
 *      1.将对象组合成树形结构以表示“部分-整体”的层次结构
 *      2.组合模式使客户端对单个对象和组合对象保持一致的方式处理
 * 类型：
 *      1.结构型
 * 适用场景
 *      1.希望客户端可以忽略组合对象与单个对象的差异时
 *      2.处理一个树形结构时
 * 优点：
 *      1.清楚地定义分层次的复杂对象，表示对象的全部或者部分层次
 *      2.让客户端忽略层次的差异，方便对整个层次结构进行控制
 *      3.简化客户端代码
 * 缺点：
 *      1.限制类型的时候较为复杂
 *      2.使设计变得更加抽象
 * 相关设计模式
 *      1.组合模式和访问者模式
 * 源码
 *      1.JDK
 *          java.awt.Container.add()
 *          java.util.HashMap.putAll()
 *          java.util.ArrayList.addAll()
 *      2.myBatis
 *          org.apache.ibatis.scripting.xmltags.SqlNode (对组合模式描述较为完整清晰)
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期",55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
