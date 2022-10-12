package com.christine.dy7_abstract;

public class Test {
    public static void main(String[] args) {
        Salary s = new Salary("Christine", 18, "松江区", 50000);
        Employee e = new Salary("Picker", 28, "松江区", 100000);
        System.out.println(s.calcPay());
        System.out.println(e.calcPay());

        // Employee e1 = new Employee("Picker", 28, "松江区");
    }
}
