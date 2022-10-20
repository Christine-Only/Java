package com.christine.dy22_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        // 添加元素
        list.add("JAVA");
        list.add("JS");
        list.add("TS");
        list.add("JAVA");
        System.out.println(list); // [JAVA, JS, TS, JAVA]

        // 集合的大小
        System.out.println(list.size()); // 4

        // 判断集合是否为空
        System.out.println(list.isEmpty()); // false

        // 判断集合中是否含有某个元素
        System.out.println(list.contains("JAVA")); // true

        // 转成数组
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr)); // [JAVA, JS, TS, JAVA]

        // 移除某个元素, 如果有重复元素默认删除前面的一个
        System.out.println(list.remove("JAVA"));
        System.out.println(list); // [JS, TS, JAVA]

        Collection<String> c = new ArrayList();
        c.add("Christine");
        c.add("Picker");
        list.addAll(c);
        System.out.println(list); // [JAVA, JS, TS, JAVA, Christine, Picker]
        System.out.println(c); // [Christine, Picker, 18]

        // 得到当前集合的迭代器对象
        Iterator<String> i = list.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        // 清空集合
        list.clear();
        System.out.println("清空后的集合：" + list); // []
    }
}
