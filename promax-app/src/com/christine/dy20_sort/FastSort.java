package com.christine.dy20_sort;

import java.util.Arrays;

public class FastSort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5]
    }
}
