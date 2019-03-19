package com.idstaa.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 *
 * @author chenjie
 * @date 2019/3/18 16:15
 */
public class ContainerSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}