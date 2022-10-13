package com.christine.dy8_interface;

/**
 * 实现接口需要注意以下几点：
 * 实现接口与继承父类相似，一样可以获得所实现接口里定义的常量和方法。如果一个类需要实现多个接口，则多个接口之间以逗号分隔。
 * 一个类可以继承一个父类，并同时实现多个接口，implements 部分必须放在 extends 部分之后。
 * 一个类实现了一个或多个接口之后，这个类必须完全实现这些接口里所定义的全部抽象方法（也就是重写这些抽象方法）；否则，该类将保留从父接口那里继承到的抽象方法，该类也必须定义成抽象类。
 */
public class PingPang implements Sports {
    private String name;

    public PingPang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "跑得快！！！");
    }

    @Override
    public void compete() {
        System.out.println(name + "比赛得第一名！！！");
    }

    @Override
    public void eat() {
        System.out.println(age);
    }
}
