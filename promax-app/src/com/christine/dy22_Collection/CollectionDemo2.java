package com.christine.dy22_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        /**
         * 增强for即可以遍历集合也可以遍历数组
         * 格式： for(数据类型 变量名: 数组或Collection集合) {}
         */

        Collection<String> list = new ArrayList<>();
        list.add("JS");
        list.add("TS");
        list.add("JAVA");

        for (String str: list) {
            System.out.println(str);
        }

        double[] scores = {90.0, 85, 78};
        for (double score : scores) {
            System.out.println(score);
        }
    }
}
