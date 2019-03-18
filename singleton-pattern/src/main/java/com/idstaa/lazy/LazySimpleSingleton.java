package com.idstaa.lazy;

/**
 * 懒汉式单例
 * 在外部需要使用的时候才进行实例化
 *
 * @author chenjie
 * @date 2019/3/18 15:54
 */
public class LazySimpleSingleton {
    /**
     * 静态块，公共内存区域
     */
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {
    }

    /**
     * 不加synchronized关键字会有线程安全
     *
     * @return 返回实例对象
     */
    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

    /*
      给 getInstance()加上 synchronized 关键字,使这个方法变成线程同步方法
      调试可以idea 线程模式调试，手动控制线程执行顺序来跟踪内存的变化状态

      缺点：用synchronized加锁，在线程数量比较多情况下，如果CPU分配压力上升，会导致大批量线程出现阻塞，
      从而导致程序运行性能下降。更好的方式，使用双重检查锁的单例模式
     */
/*    public synchronized static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }*/
}
