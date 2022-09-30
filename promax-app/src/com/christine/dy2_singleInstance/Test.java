package com.christine.dy2_singleInstance;

public class Test {
    public static void main(String[] args) {
        System.out.println(SingleInstance.newInstance());
        System.out.println(SingleInstance.newInstance());
        System.out.println(SingleInstance2.getInstance());
    }
}
