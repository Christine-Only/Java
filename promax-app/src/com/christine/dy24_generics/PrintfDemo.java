package com.christine.dy24_generics;

public class PrintfDemo {
    public static void main(String[] args) {
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println( "字符型数组元素为:" );
        printArray(charArray);
        System.out.println( "\n双精度型数组元素为:" );
        printArray(doubleArray);
    }

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.printf("%s ", t);
        }
    }
}
