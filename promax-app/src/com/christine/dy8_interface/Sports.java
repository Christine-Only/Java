package com.christine.dy8_interface;

public interface Sports extends People {
    /**
     * 接口不能被类继承，只能被类实现
     * 接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）。
     * 接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（并且只能是 public，用 private 修饰会报编译错误）。
     */
    // int age; // 报错，变量必须被初始化
    int age = 18; // 等同于 public static final int age = 18;
    void run();
    void compete(); // 等同于 public abstract void compete();
}
