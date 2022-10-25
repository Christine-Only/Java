package com.christine.dy25_Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /**
         * TreeSet集合默认的规则 （无重复 有排序 无索引）
         * 对于数值类型：Integer，Double官方默认按照大小进行升序排列。
         * 对于字符串类型：默认按照首字符的编号升序排列。
         * 对于自定义类型如Student对象，TreeSet无法直接排序。
         * 自定义排序规则：
         * 1. 类实现Comparable接口，重写比较规则；
         * 2. 集合自定义Comparator比较器对象，重写比较规则。
         *
         * 📢如果TreeSet集合存储的对象有实现比较规则，集合也自带比较器，默认使用集合自带的比较器排序。
         */

        Set<Integer> sets = new TreeSet<>();
        sets.add(20);
        sets.add(10);
        sets.add(8);
        sets.add(27);
        sets.add(4);
        System.out.println(sets); // [4, 8, 10, 20, 27]

        Set<String> sets2 = new TreeSet<>();
        sets2.add("kkh");
        sets2.add("picker");
        sets2.add("christine");
        sets2.add("A");
        sets2.add("a");
        sets2.add("中国");
        System.out.println(sets2); // [A, a, christine, kkh, picker, 中国]

        Set<Fruit> fruits = new TreeSet<>(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getNum() - o2.getNum(); // 升序
            }
        });
        Fruit apple = new Fruit("apple", "red", 10, 23.6);
        Fruit apple2 = new Fruit("apple", "red", 10, 23.6);
        System.out.println(apple.hashCode()); // 645691249
        System.out.println(apple2.hashCode()); // 645691249
        fruits.add(apple);
        fruits.add(apple2);
        fruits.add(new Fruit("orange", "yellow", 30, 13.6));
        System.out.println(fruits); // 重复的会去掉一个 [Fruit{name='apple', color='red', num=10, money=23.6}, Fruit{name='orange', color='yellow', num=30, money=13.6}]
    }
}
