package com.christine.dy19_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] arr = {10, 8, 12, 4, 20};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr)); // [10, 8, 12, 4, 20]

        /**
         * sort() 将数组中的元素升序排列
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [4, 8, 10, 12, 20]

        // 调用binarySearch方法时要求数组中元素己经按升序排列，这样才能得到正确结果。
        System.out.println(Arrays.binarySearch(arr, 8));

        Integer[] b = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(b));
        System.out.println("a数组和b数组是否相等：" + Arrays.equals(arr, b));

        /**
         * void fill(type[] a, type val): 该方法将会把 a 数组的所有元素都赋值为 val。
         */
        Arrays.fill(b, 10);
        System.out.println(Arrays.toString(b)); // [10, 10, 10, 10, 10]

        /**
         * void fill(type[] a, int fromIndex, int toIndex, type val): 该方法仅仅将 a 数组的 fromIndex 到 toIndex 索引的数组元素赋值为 val。
         */
        Arrays.fill(arr, 2, 4, 6);
        System.out.println(Arrays.toString(arr)); // [4, 8, 6, 6, 20]

        // 将数组中的元素降序排列
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("arr降序后的结果为：" + Arrays.toString(arr)); // [20, 8, 6, 6, 4]
    }
}
