package com.christine.dy27_Map;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        // 集合嵌套
        Map<String, List<String>> maps = new HashMap<>();
        List<String> arr1 = new ArrayList<>();
        Collections.addAll(arr1, "A", "B", "C");
        maps.put("Christine", arr1);

        List<String> arr2 = new ArrayList<>();
        Collections.addAll(arr2, new String[]{"C", "D"});
        maps.put("Picker", arr2);

        System.out.println(maps); // {Christine=[A, B, C], Picker=[C, D]}

        Collection<List<String>> values = maps.values();
        System.out.println(values); // [[A, B, C], [C, D]]

        Map<String, Integer> maps2 = new HashMap<>();

        for (List<String> value : values) {
            for (String s : value) {
                if (maps2.containsKey(s)) {
                    maps2.put(s, maps2.get(s) + 1);
                } else {
                    maps2.put(s, 1);
                }
            }
        }
        System.out.println(maps2); // {A=1, B=1, C=2, D=1}
    }
}
