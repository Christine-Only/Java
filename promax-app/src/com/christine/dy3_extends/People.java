package com.christine.dy3_extends;

public class People {
    private String name;
    private int age;

    public void queryCourse() {
        System.out.println(name + "在查看课表");
    }

    public People() {
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
