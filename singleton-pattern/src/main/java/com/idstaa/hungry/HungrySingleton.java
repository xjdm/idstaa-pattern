package com.idstaa.hungry;

/**
 * 饿汉式单例
 * 优点：没有加任何的锁，执行效率比较高，在用户体验上来说，比懒汉式更好
 * 缺点：类加载的时候就初始化，不管用于不用都占着空间，浪费了内存
 *
 * @author chenjie
 * @date 2019/3/18 15:49
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
