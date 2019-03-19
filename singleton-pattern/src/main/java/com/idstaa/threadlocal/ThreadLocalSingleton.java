package com.idstaa.threadlocal;

/**
 * @author chenjie
 * @date 2019/3/18 16:36
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE =
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL_INSTANCE.get();
    }
}

