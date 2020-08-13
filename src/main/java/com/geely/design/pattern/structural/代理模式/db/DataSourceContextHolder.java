package com.geely.design.pattern.structural.代理模式.db;

public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTENT_HOLDER = new ThreadLocal<String>();

    public static void setDBType(String dbType) {
        CONTENT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return  (String) CONTENT_HOLDER.get();
    }

    public static void clearDBType (){
        CONTENT_HOLDER.remove();
    }
}
