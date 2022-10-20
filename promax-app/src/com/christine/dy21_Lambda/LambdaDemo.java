package com.christine.dy21_Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        /**
         * 函数式接口有什么作用？
         * 函数式接口能够接受匿名内部类的实例化对象，换句话说，我们可以使用匿名内部类来实例化函数式接口的对象，而Lambda表达式能够代替内部类实现代码的进一步简化
         */
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("跑快点");
//            }
//        };
        Runnable r = () -> System.out.println("跑快点");
        r.run();
    }
}

/**
 * 什么是函数式接口？
 * 即SAM（Single Abstract Method ）接口，有且只有一个抽象方法的接口（可以有默认方法或者是静态方法和从Object继承来的方法，但是抽象方法有且只能有一个）
 */
@FunctionalInterface
interface Runnable {
    void run();
//    void study();
}
