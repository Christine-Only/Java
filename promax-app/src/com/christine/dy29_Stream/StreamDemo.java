package com.christine.dy29_Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        /** -----------------------------获取集合的Stream流--------------------------------- */
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        /** -----------------------------获取Map集合Stream流--------------------------------- */
        Map<String, Integer> maps = new HashMap<>();
        // 键流
        Stream<String> keyStream  = maps.keySet().stream();

        // 值流
        Stream<Integer> valueStream = maps.values().stream();

        // 键值对流
        Stream<Map.Entry<String, Integer>> keyAndValueStream = maps.entrySet().stream();

        /** -----------------------------数组获取流--------------------------------- */
        String[] names = {"Christine", "Picker"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
    }
}
