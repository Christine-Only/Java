package com.christine.dy11_interClass_anonymous;

public class Test {
    public static void main(String[] args) {
        // Swimming s = new Student();
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳游得很快~~~");
            }
        };

        go(s);
    }

    public static void go(Swimming s) {
        System.out.println("游泳开始");
        s.swim();
        System.out.println("游泳结束");
    }
}

//class Student implements Swimming {
//
//    @Override
//    public void swim() {
//        System.out.println("学生游泳游得很快~~~");
//    }
//}

interface Swimming {
    void swim();
}
