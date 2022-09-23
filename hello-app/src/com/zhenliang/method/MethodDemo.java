package com.zhenliang.method;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(sum(0));
        System.out.println(sum(-5));
        System.out.println(sum(3));
        System.out.println(sum(9));
        System.out.println(judgeOddOrEven(3452));
        System.out.println(judgeOddOrEven(29));

        int[] arr = {10, 23, 45, 67, 3};
        System.out.println(max(arr));
    }
    
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static String judgeOddOrEven(int n) {
        if (n % 2 == 0) {
            return n + "为偶数";
        } else {
            return n + "为奇数";
        }
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
