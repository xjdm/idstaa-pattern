package com.idstaa.factorymethod;

import com.idstaa.ICourse;
import com.idstaa.PythonCourse;

/**
 * @author chenjie
 * @date 2019/3/15 15:35
 */
public class PythonCourseFactory implements ICourseFactory

{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
