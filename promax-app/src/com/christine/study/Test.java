package com.christine.study;

public class Test {
    // 静态成员 可以被共享 内存中只有一份
    public static int age = 18;
    public static void test() {
        System.out.println("我是静态方法");
    };

    // 实例成员
    public String name;
    public void go() {
        System.out.println("我是实例方法");
    };

    // 实例方法可以访问静态成员，也可以访问实例成员
    public void run() {
        System.out.println(Test.age);
        System.out.println(name);
    }

    // 静态方法只能访问静态成员,不能直接访问实例成员。
    public static void main(String[] args) {
        System.out.println(Test.age);
        test();
        // System.out.println(name); 报错了
        Test s = new Test();
        s.name = "Christine";
        System.out.println(s.name);
        s.go();
        s.run();
    }

    // 静态方法中不能出现this关键字
    public static void test1() {
        // System.out.println(this); this不能出现在静态方法中
    }
}
