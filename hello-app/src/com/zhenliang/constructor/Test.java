package com.zhenliang.constructor;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("奔驰", 38.9);
        System.out.println(car.name);
        System.out.println(car.price);

        Car car1 = new Car();
        car1.name = "宝马";
        car1.price = 78;
        System.out.println(car1.name);
    }
}
