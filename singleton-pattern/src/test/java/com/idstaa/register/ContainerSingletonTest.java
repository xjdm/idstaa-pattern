package com.idstaa.register;

import com.idstaa.lazy.ConcurrentExecutor;

/**
 * @author chenjie
 * @date 2019/3/18 16:23
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {


        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(() -> {
                Object obj = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
                System.out.println(System.currentTimeMillis() + ": " + obj);
            }, 10, 6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
