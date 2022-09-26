package com.zhenliang.object;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "christine";
        s.age = 18;
        System.out.println(s.name);
        System.out.println(s.age);

        s.run();
        s.lick();

        System.out.println("====================");
        s.name = "picker";
        s.age = 28;
        System.out.println(s.name);
        System.out.println(s.age);

        s.run();
        s.lick();
    }
}
