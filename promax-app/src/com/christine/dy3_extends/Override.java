package com.christine.dy3_extends;

public class Override {
    public static void main(String[] args) {
        Car c = new Truck();
        c.move();
    }
}

class Car {
    public void move() {
        System.out.println("汽车可以移动");
    }
}

class Truck extends Car {
    @java.lang.Override
    public void move() {
        super.move();
        System.out.println("卡车很大");
    }
}
