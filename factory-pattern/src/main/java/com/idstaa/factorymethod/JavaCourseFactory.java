package com.idstaa.factorymethod;

import com.idstaa.ICourse;
import com.idstaa.JavaCourse;

/**
 * @author chenjie
 * @date 2019/3/15 15:34
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
