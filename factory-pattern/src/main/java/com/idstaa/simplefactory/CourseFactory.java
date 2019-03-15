package com.idstaa.simplefactory;

import com.idstaa.ICourse;
import com.idstaa.JavaCourse;
import com.idstaa.PythonCourse;

/**
 * @author chenjie
 * @date 2019/3/15 14:45
 */
public class CourseFactory {
    public ICourse create(String name){
        if ("java".equals(name)){
            return  new JavaCourse();
        } else if("python".equals(name)){
            return new PythonCourse();
        }else {
            throw new RuntimeException("没有该类型的课程");
        }
    }
}
