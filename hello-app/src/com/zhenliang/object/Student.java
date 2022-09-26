package com.zhenliang.object;

public class Student {
    // 修饰符 数据类型 变量名 = 初始值；
    // 一般无需给成员变量初始值！
    String name;
    int age;

    public void lick() {
        System.out.println(name + "喜欢编程");
    }

    public void run() {
        System.out.println(age + "岁的" + name + "跑得很快！");
    }
}
