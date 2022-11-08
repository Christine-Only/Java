package com.christine.dy29_Stream;

public class Employee {
    private String name;
    private char sex;
    private double salary;
    private double bonus;
    private String penaltyRecords;

    public Employee(String name, char sex, double salary, double bonus, String penaltyRecords) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
        this.penaltyRecords = penaltyRecords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPenaltyRecords() {
        return penaltyRecords;
    }

    public void setPenaltyRecords(String penaltyRecords) {
        this.penaltyRecords = penaltyRecords;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", penaltyRecords='" + penaltyRecords + '\'' +
                '}';
    }
}
