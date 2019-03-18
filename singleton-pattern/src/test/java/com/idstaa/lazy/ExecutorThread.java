package com.idstaa.lazy;

/**
 * @author chenjie
 * @date 2019/3/18 16:23
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
//        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
