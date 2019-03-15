package com.idstaa.abstractfactory;

/**
 * @author chenjie
 * @date 2019/3/15 15:53
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
