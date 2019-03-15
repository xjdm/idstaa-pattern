package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:50
 */
public interface CourseFactory {
    /**
     * 创建笔记
     *
     * @return 返回笔记视图类
     */
    INote createNote();

    /**
     * 创建视频
     *
     * @return 返回视频类
     */
    IVideo createVideo();
}
