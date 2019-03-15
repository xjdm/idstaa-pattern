package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:52
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
