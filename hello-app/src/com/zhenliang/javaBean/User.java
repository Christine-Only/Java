package com.zhenliang.javaBean;

public class User {
    // JavaBean也可以成为实体类
    // 成员变量建议用private私有
    private double salary;
    private String name;
    private double height;

    public User() {

    }

    /**
     * 要求提供无参数构造器，有参数构造器是可选
     */
    public User(double salary, String name, double height) {
        this.salary = salary;
        this.name = name;
        this.height = height;
    }

    /**
     * 必须为成员变量提供成套的setter和getter方法
     */
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
