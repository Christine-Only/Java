package com.christine.dy3_extends;

public class Test {
    public static void main(String[] args) {
        /**
         * 继承的特点
         * 1. 子类可以继承父类的属性和行为，但子类不能继承父类的构造器。
         * 2. Java是单继承模式：一个类只能继承一个直接父类。
         * 3. Java不支持多继承，但是支持多层继承。
         * 4. Java中所有的类都是Object类的子类。
         */
        Student s = new Student();
        s.setName("Christine");
        s.setAge(18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.writeInfo();
        s.queryCourse();
    }
}
