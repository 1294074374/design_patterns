package com.geely.design.pattern.creational.creational.单例模式.容器;


import org.apache.commons.lang.StringUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class ContainerSingleton {
    private static Map<String, Object> singleMap = new HashMap<String, Object>();
    public static void putInstance(String key, Object instance) {
        // 保证key的合法性和唯一性
        if (!StringUtils.isNotBlank(key) || instance != null) {
            if (!singleMap.containsKey(key)) {
                singleMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singleMap.get(key);
    }

    private ContainerSingleton(){

    }
}
