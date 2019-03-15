package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:56
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
