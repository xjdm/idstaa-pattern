package com.idstaa.lazy;

/**
 * @author chenjie
 * @date 2019/3/18 15:59
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     * 当第一个线程调用 getInstance()方法时， 第二个线程也可以调用 getInstance()。 当第一
     * 个线程执行到 synchronized 时会上锁， 第二个线程就会变成 MONITOR 状态， 出现阻
     * 塞。 此时， 阻塞并不是基于整个 LazySimpleSingleton 类的阻塞， 而是在 getInstance()
     * 方法内部阻塞， 只要逻辑不是太复杂， 对于调用者而言感知不到。
     *
     * @return 返回实例
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazySimpleSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    // 1.分配内存给这个对象
                    // 2.初始化对象
                    // 3.设置lazy指向刚分配的内存地址
                    // 4.初次访问对象
                }
            }
        }
        return lazy;
    }
}
