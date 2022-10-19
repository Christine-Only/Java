package com.christine.dy20_sort;

public class BinarySearchSort {
    public static void main(String[] args) {
        int[] arr = {10, 14, 16, 28, 30, 88};
        System.out.println(binarySearch(arr, 28)); // 3
        System.out.println(binarySearch(arr, 100)); // -1
        System.out.println(binarySearch(arr, 6)); // -1
    }

    public static int binarySearch(int[] arr, int key) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            if (key > arr[middleIndex]) {
                leftIndex = middleIndex + 1;
            } else if (key < arr[middleIndex]) {
                rightIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }

        return -1;
    }
}
