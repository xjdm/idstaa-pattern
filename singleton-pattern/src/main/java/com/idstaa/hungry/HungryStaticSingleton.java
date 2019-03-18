package com.idstaa.hungry;

/**
 * 饿汉式静态代码块单例
 *
 * @author chenjie
 * @date 2019/3/18 15:52
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
