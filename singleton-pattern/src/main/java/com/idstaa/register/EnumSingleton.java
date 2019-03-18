package com.idstaa.register;

/**
 * @author chenjie
 * @date 2019/3/18 16:19
 */
public enum EnumSingleton {
    /**
     * 枚举单例
     */
    INSTANCE;
    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
