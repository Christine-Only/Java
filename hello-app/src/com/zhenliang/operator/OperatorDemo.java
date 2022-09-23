package com.zhenliang.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        //  赋值运算符
        /**
         * += -= *= /= %=
         */
        int i = 10;
        int j = 3;

        System.out.println(i += j); // 13
        System.out.println(i *= j); // 39
        System.out.println(i /= j); // 13
        System.out.println(i -= j); // 10
        System.out.println(i %= j); // 1

        System.out.println("=========================");

        //  关系运算符
        System.out.println(1 == 2); // false
        System.out.println(1 <= 2); // true
        System.out.println(1 >= 2); // false
        System.out.println(1 != 2); // true
        System.out.println(1 < 2);  // true
        System.out.println(1 > 2);  // false

        System.out.println("=========================");

        //  逻辑运算符
        /**
         * 短路运算符 && ||
         * 逻辑运算符 & | ^ !
         *
         * ^ 异或 一真一假才为真
         */
        int a = 30;
        int b = 20;
        System.out.println( a > b & b++ > 25 ); // false
        System.out.println(b); // 21
        System.out.println( a > b && b++ > 25 ); // false
        System.out.println(b); // 22
        System.out.println( a < b && b++ > 25 ); // false
        System.out.println(b); // 22
        System.out.println(!true); // false
        System.out.println(a > b | b++ > 25); // true
        System.out.println(b); // 23
        System.out.println(a > b || b++ > 25); // true
        System.out.println(b); // 23
        System.out.println(a > b ^ b > 15); // false
        System.out.println(a < b ^ b > 15); // true
        System.out.println(a < b ^ b < 15); // false
        System.out.println(a > b ^ b < 15); // true


        System.out.println("=========================");

        int k = 999;
        int l = 100;
        int max = k > l ? k : l;
        System.out.println(max);
    }
}
