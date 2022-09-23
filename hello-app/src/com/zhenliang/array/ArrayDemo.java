package com.zhenliang.array;

public class ArrayDemo {
    public static void main(String[] args) {
        // 静态数组
        int[] ages = {12, 24, 36};
        System.out.println(ages); // 数组的索引值

        System.out.println(ages[0]);
        System.out.println(ages[2]);

        ages[1] = 88;
        System.out.println(ages[1]);

        // 动态数组
        /**
         * byte、short、char、long、int在动态数组中默认值是0
         * float、double在动态数组中默认值是0.0
         * boolean在动态数组中默认值是false
         * 引用类型在动态数组中默认值是null
         */

        String names[] = new String[10];
        System.out.println(names.length);

        System.out.println(names[2]); // null

        boolean[] bools = new boolean[3];
        System.out.println(bools[2]); // false

        char[] cha = new char[4];
        System.out.println((int)cha[3]); // 0

    }
}
