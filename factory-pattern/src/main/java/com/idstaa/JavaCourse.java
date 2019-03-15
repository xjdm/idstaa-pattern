package com.idstaa;

/**
 * @author chenjie
 * @date 2019/3/15 14:39
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
