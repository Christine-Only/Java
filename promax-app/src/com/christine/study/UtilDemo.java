package com.christine.study;

public class UtilDemo {
    public static void main(String[] args) {
        System.out.println(ArrayUtil.toString(null));
        int[] arr = {};
        System.out.println(ArrayUtil.toString(arr));
        int[] arr1 = {1,2,3,4};
        System.out.println(ArrayUtil.toString(arr1));
    }
}
