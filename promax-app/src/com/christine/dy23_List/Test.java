package com.christine.dy23_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Html");
        list.add("Java");
        list.add("Java");
        list.add("Css");
        list.add("TypeScript");
        System.out.println(list); // [Html, Java, Java, Css, TypeScript]

        System.out.println("=========删除list中的全部Java=============");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if("Java".equals(s)) {
                list.remove(s);
                i--; // 注意这里一定要i--，否则会漏删
            }
        }
        System.out.println(list); // [Html, Css, TypeScript]

        // 快捷键生成 cmd+alt+v
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            if("Java".equals(s)) {
                // list.remove(s);
                iterator.remove();
            }
        }
        System.out.println(list);

        // 删除元素时不要使用增强for循环和Lambda表达式(forEach)，会报错！！！
    }
}
