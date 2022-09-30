package com.christine.dy3_extends;

public class Student extends People{
    /**
     * 子类默认会调用父类的无参数构造器
     */

    public void writeInfo() {
        System.out.println(getName() + "完成了课程信息");
    }

    public Student() {
        System.out.println("====子类无参数构造器被调用啦====");
    }

    public Student(String name, int age) {
        super(name, age); // 通过调用父类有参数构造器来初始化继承自父类的数据
        System.out.println("====子类有参数构造器被调用啦====");
    }

}
