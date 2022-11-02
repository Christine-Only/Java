package com.christine.dy27_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            String str = arr[index];
            sb.append(str);
        }

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
