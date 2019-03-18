package com.idstaa.threadlocal;

/**
 * @author chenjie
 * @date 2019/3/18 16:36
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
