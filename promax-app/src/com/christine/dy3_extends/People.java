package com.christine.dy3_extends;

public class People {
    private String name;
    private int age;

    public void queryCourse() {
        System.out.println(name + "在查看课表");
    }

    public People() {
        System.out.println("====父类无参数构造器被调用啦====");
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
