package com.christine.dy9_polymorphic;

public class Keyboard implements USB{
    private String name;
    public static int num = 20;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "连接");
    }

    @Override
    public void unplug() {
        System.out.println(name + "拔出");
    }

    public void typing() {
        System.out.println("正在使用" + name + "打字");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
