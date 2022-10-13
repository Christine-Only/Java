package com.christine.dy9_polymorphic;

public class Mouse implements USB{
    private String name;
    public static int num = 10;

    public Mouse(String name) {
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

    public void click() {
        System.out.println("用" + name + "鼠标很舒服哎");
    }
}
