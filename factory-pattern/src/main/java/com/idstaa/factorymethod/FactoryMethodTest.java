package com.idstaa.factorymethod;

import com.idstaa.ICourse;

/**
 * @author chenjie
 * @date 2019/3/15 15:36
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }
}
