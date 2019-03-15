package com.idstaa.factorymethod;

import com.idstaa.ICourse;

/**
 * @author chenjie
 * @date 2019/3/15 15:34
 */
public interface ICourseFactory {
    /**
     * 创建课程
     */
    ICourse create();
}
