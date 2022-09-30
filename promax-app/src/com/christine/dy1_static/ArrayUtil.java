package com.christine.dy1_static;

public class ArrayUtil {
    // 私有构造器
    private ArrayUtil() {};

    public static String toString(int[] arr) {
        if ( arr == null ) {
            return null;
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        str += "]";
        return str;
    }
}
