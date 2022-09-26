package com.zhenliang.encapsulation;

public class Person {
    private int age;

    public int getAge() {
        // return this.age;
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age <=200) {
            this.age = age;
        } else {
            System.out.println("输入的格式有误！");
        }
    }


}
