package com.idstaa.hungry;

/**
 * 饿汉式静态代码块单例
 *
 * @author chenjie
 * @date 2019/3/18 15:52
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton HUNGRY_STATIC_SINGLETON;

    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return HUNGRY_STATIC_SINGLETON;
    }
}
