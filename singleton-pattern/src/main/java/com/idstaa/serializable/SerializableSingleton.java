package com.idstaa.serializable;

import java.io.Serializable;

/**
 * @author chenjie
 * @date 2019/3/18 16:23
 */
public class SerializableSingleton implements Serializable {
    public final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 增加readResolve方法，防止序列化破坏单例
     *
     * @return 返回之前的示例
     */
    private Object readResolve() {
        return INSTANCE;
    }
}
