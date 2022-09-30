package com.christine.dy2_singleInstance;

public class SingleInstance2 {
    // 懒汉模式
    private static SingleInstance2 instance;

    private SingleInstance2() {}

    public static synchronized SingleInstance2 getInstance() {
        if (instance == null) {
            instance = new SingleInstance2();
        }
        return instance;
    }

    /**
     * 懒汉模式中单例是在需要的时候才去创建的，如果单例已经创建，再次调用获取接口将不会重新创建新的对象，而是直接返回之前创建的对象。如果某个单例
     * 使用的次数少，并且创建单例消耗的资源较多，那么就需要实现单例的按需创建，这个时候使用懒汉模式就是一个不错的选择。但是这里的懒汉模式并没有考
     * 虑线程安全问题，在多个线程可能会并发调用它的getInstance()方法，导致创建多个实例，因此需要加锁解决线程同步问题。
     */


}
