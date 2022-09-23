package com.zhenliang.array;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        // 冒泡排序
        int[] values = new int[5];
        
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            System.out.println("请输入你的工号：");
            values[i] = s.nextInt();
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if(values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        
    }
}
