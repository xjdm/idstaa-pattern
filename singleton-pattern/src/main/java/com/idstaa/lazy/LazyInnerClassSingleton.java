package com.idstaa.lazy;

/**
 * 懒汉式单例
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 * 完美地屏蔽了这两个缺点
 *
 * @author chenjie
 * @date 2019/3/18 16:03
 */
public class LazyInnerClassSingleton {

    /**
     * 默认使用LazyInnerClassGeneral的时候，会先初始化内部类
     * 增加判断，防止反射破坏单例
     */
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * 如果没使用的话，内部类是不加载的
     *
     * @return 返回对象示例
     */
    public static final LazyInnerClassSingleton getInstance() {
        // 在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    /**
     * 静态内部类：默认不加载
     */
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    // 参考资料：https://blog.csdn.net/mnb65482/article/details/80458571


}
