package com.christine.dy29_Stream;

public class TopperFormer {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public TopperFormer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TopperFormer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
