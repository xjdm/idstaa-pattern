package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:53
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
