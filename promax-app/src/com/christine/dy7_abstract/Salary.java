package com.christine.dy7_abstract;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public double calcPay() {
        System.out.println(getName());
        return salary / 2;
    }
}
