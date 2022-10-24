package com.christine.dy24_generics;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        /**
         * 使用泛型定义类型必须使用引用类型
         */
        String[] names = {"Christine", "Picker", "Chris"};
        Integer[] ages = {18, 28, 38};

        splicingArray(names);
        splicingArray(ages);
        splicingArray(null);
    }

    public static <T> void splicingArray(T[] arr) {
        if (arr != null) {
            StringBuilder s = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            s.append("]");
            System.out.println(s);
        } else {
            System.out.println(Objects.toString(arr));
        }
    }
}
