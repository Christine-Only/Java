package com.christine.dy22_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("JS");
        list.add("TS");
        list.add("JAVA");

        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
