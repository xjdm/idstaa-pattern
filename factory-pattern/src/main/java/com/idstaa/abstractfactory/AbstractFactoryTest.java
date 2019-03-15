package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:56
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourceFactory factory = new JavaCourceFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
