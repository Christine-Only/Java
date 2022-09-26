package com.zhenliang.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        int[] numbers1 = {10,20,30, 67};
        int[] numbers2 = {10,20,30, 67};
        System.out.println(checkArrEqual(numbers1, numbers2));

        int[] arr1 = {};
        int[] arr2 = {};
        System.out.println(checkArrEqual(arr1, arr2));
    }

    public static boolean checkArrEqual(int[] numbers1, int[] numbers2) {
        if(numbers1 == null || numbers2 != null || numbers1.length == 0 || numbers2.length == 0) {
            return false;
        }
        for (int i = 0; i < numbers1.length; i++) {
            if(numbers1[i] == numbers2[i] && numbers1.length == numbers2.length) {
                return true;
            }
        }
        return false;
    }
}
