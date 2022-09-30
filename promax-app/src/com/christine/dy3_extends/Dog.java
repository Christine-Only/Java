package com.christine.dy3_extends;

public class Dog extends Animal{
    private String name = "dog";

    public void run() {
        System.out.println("狗跑得很快");
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
        super.run();
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        String name = "哈利";
        System.out.println(name);
        System.out.println(d.name);
        d.run();
    }
}
