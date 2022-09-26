package com.christine.demo;

public class Test5 {
    public static void main(String[] args) {
        // 1983
        int number = 1983;
        int ge = number % 10 + 5;
        int shi = number / 10 % 10 + 5;
        int bai = number / 100 % 10 + 5;
        int qian = number / 1000 + 5;
        ge %= 10;
        shi %= 10;
        bai %= 10;
        qian %= 10;
        int newNum = ge * 1000 + shi * 100 + bai * 10 + qian;
        System.out.println(newNum);
    }
}
