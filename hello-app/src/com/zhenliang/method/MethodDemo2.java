package com.zhenliang.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55};
        System.out.println(findIndex(numbers, 66));
        System.out.println(findIndex(numbers, 33));
    }


    public static int findIndex(int[] ares, int num) {
        int idx = -1;
        for (int i = 0; i < ares.length; i++) {
            if (ares[i] == num) {
                idx = i;
            }
        }
        return idx;
    }
}
