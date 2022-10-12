package com.christine.dy8_interface;

/**
 * 当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象的类。
 * 一个类可以实现多个接口。
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

    }
}
