package com.idstaa.lazy;

/**
 * @author chenjie
 * @date 2019/3/18 16:23
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
