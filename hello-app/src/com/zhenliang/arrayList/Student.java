package com.zhenliang.arrayList;

public class Student {
    private String stuNum;
    private String name;
    private int age;
    private String className;

    public Student() {}

    public Student(String stuNum, String name, int age, String className) {
        this.stuNum = stuNum;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
