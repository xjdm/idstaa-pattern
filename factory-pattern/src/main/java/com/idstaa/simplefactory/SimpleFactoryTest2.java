package com.idstaa.simplefactory;

/**
 * @author chenjie
 * @date 2019/3/15 14:41
 */
public class SimpleFactoryTest2 {
    public static void main(String[] args) {
        CourseFactory2 factory = new CourseFactory2();
        factory.create("com.idstaa.JavaCourse").record();
    }
}
