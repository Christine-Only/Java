package com.christine.dy28_unchange_Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> lists = List.of("Christine", "Picker");
        // lists.add("baby"); // 报错

        Set<String> sets = Set.of("Christine", "Picker");
        System.out.println(sets);
        // sets.add("baby"); // 报错

        Map<String, Integer> maps = Map.of("Christine", 18, "Picker", 28);
        System.out.println(maps);
        // maps.put("Christine", 19); // 报错 不能修改

    }
}
