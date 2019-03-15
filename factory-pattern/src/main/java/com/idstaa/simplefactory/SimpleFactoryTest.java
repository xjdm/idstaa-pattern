package com.idstaa.simplefactory;

/**
 * @author chenjie
 * @date 2019/3/15 14:41
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        // 1、最简单的测试
/*        ICourse course = new JavaCourse();
        course.record();*/

        // 2、引入工厂
        CourseFactory factory = new CourseFactory();
        factory.create("java").record();
    }
}
