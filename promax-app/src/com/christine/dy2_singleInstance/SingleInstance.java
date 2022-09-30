package com.christine.dy2_singleInstance;

public class SingleInstance {
    /**
     * 单例模式：这种模式涉及一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
     */

    /**
     * 饿汉模式：
     */
    private static SingleInstance instance = new SingleInstance();

    private SingleInstance() {};

    public static SingleInstance newInstance() {
        return instance;
    }

    /**
     *  饿汉模式优点：类的构造函数定义为private，保证其他类不能实例化此类，然后提供了一个静态实例并返回给调用者。饿汉模式是最简单的一种实
     *  现方式，饿汉模式在类加载的时候就对实例进行创建，实例在整个程序周期都存在。它的好处是只在类加载的时候创建一次实例，不会存在多个线程创建多个
     *  实例的情况，避免了多线程同步的问题。
     *   饿汉模式缺点：即使这个单例没有用到也会被创建，而且在类加载之后就被创建，内存就被浪费了。
     */
}
