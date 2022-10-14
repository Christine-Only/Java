package com.christine.dy12_api;

import java.util.Objects;

public class Equals {
    private String name;
    private int age;

    public Equals(String name, int age) {
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        Object getClass() 方法用于获取对象的运行时对象的类。
//        if (o == null || getClass() != o.getClass()) return false;
//        Equals equals = (Equals) o;
//        return age == equals.age && Objects.equals(name, equals.name);
//    }

    @Override
    public String toString() {
        return "Equals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Equals e) {
        if(e instanceof Equals) {
            Equals e2 = (Equals) e;
            return e2.age == age && Objects.equals(name, e2.name);
        } else {
            return false;
        }
    }
}
