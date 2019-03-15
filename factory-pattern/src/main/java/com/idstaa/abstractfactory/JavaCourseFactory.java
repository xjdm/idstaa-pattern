package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:54
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
