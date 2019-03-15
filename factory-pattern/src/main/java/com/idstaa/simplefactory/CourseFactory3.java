package com.idstaa.simplefactory;

import com.idstaa.ICourse;

/**
 * @author chenjie
 * @date 2019/3/15 14:51
 */
public class CourseFactory3 {
    public ICourse create(Class<? extends ICourse> clazz) {
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
