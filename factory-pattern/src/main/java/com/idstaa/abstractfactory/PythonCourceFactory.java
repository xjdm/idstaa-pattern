package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:54
 */
public class PythonCourceFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
