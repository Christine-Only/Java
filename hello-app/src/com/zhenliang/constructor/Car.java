package com.zhenliang.constructor;

public class Car {
    String name;
    double price;

    // 无参数构造器
    public Car(){
        System.out.println("无参数构造器被引用啦");
    }

    // 有参数构造器
    //    public Car(String n, double p) {
    //        name = n;
    //        price = p;
    //    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
