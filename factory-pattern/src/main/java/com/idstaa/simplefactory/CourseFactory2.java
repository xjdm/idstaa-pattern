package com.idstaa.simplefactory;

import com.idstaa.ICourse;

/**
 * @author chenjie
 * @date 2019/3/15 14:51
 */
public class CourseFactory2 {
    public ICourse create(String className) {
        if (className != null && !"".equals(className)){
            try {
                return (ICourse)Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
