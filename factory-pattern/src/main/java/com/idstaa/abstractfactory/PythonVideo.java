package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:52
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
