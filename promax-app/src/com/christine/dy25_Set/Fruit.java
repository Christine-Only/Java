package com.christine.dy25_Set;

import java.util.Objects;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private String color;
    private int num;
    private double money;

    public Fruit() {
    }

    public Fruit(String name, String color, int num, double money) {
        this.name = name;
        this.color = color;
        this.num = num;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", num=" + num +
                ", money=" + money +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        // return Double.compare(this.money, o.money); // 浮点型排序需要使用Double.compare
        return o.num - this.num; // 降序排列
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return num == fruit.num && Double.compare(fruit.money, money) == 0 && Objects.equals(name, fruit.name) && Objects.equals(color, fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, num, money);
    }
}
