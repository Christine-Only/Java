package com.christine.dy23_List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("==========栈：先进后出===========");
        // 压栈
        list.addFirst("Java");
        list.addFirst("Html");
        list.addFirst("JavaScript");
        System.out.println(list); // [JavaScript, Html, Java]

        System.out.println(list.getFirst()); // JavaScript
        System.out.println(list); // [JavaScript, Html, Java]

        // 弹栈
        System.out.println(list.removeFirst()); // JavaScript
        System.out.println(list.removeFirst()); // Html
        System.out.println(list); // [Java]

        System.out.println("==========队列：先进先出===========");
        // 入队
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("第一号选手");
        queue.addLast("第二号选手");
        queue.addLast("第三号选手");

        System.out.println(queue); // [第一号选手, 第二号选手, 第三号选手]

        // 出队
        System.out.println(queue.removeFirst()); // 第一号选手
        System.out.println(queue.removeFirst()); // 第二号选手
        System.out.println(queue); // [第三号选手]
    }
}
