package com.idstaa.simplefactory;

import com.idstaa.JavaCourse;

/**
 * @author chenjie
 * @date 2019/3/15 14:41
 */
public class SimpleFactoryTest3 {
    public static void main(String[] args) {
        CourseFactory3 factory = new CourseFactory3();
        factory.create(JavaCourse.class).record();
    }
}
