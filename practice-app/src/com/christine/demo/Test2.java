package com.christine.demo;

public class Test2 {
    public static void main(String[] args) {
        // 判断101-200之间有多少个素数
        int[] numbers = new int[100];

        for (int i = 101; i <= 200; i++) {

            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i + "\t");
            }
        }
    }
}
