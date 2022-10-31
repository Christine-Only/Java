package com.christine.dy26_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, new String[]{"Christine", "Picker"});
        System.out.println(list);
    }
}
