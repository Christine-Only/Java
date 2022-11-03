package com.christine.dy23_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();

        lists.add("JAVA");
        lists.add(1, "HTML");
        lists.add(2, "HTML");

        System.out.println(lists); // [JAVA, HTML]

        System.out.println("==========for循环============");
        // for循环
        for (int i = 0; i < lists.size(); i++) {
            String ele = lists.get(i);
            System.out.println(ele);
        }

        System.out.println("==========for增强============");
        // for增强
        for (String ele: lists) {
            System.out.println(ele);
        }

        System.out.println("==========迭代器============");
        Iterator<String> i = lists.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("==========forEach============");
        lists.forEach(ele -> System.out.println(ele));

        // 索引值越界会报错
        System.out.println(lists.remove(1)); // HTML
    }
}
