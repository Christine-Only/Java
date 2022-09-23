package com.zhenliang.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] data = new int[5];
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        /**
         * LOOP:  使用标签结束外部循环
         * break: 只能结束当前循环
         */
        LOOP:
        while (true) {
            System.out.println("请输入1-20之前的整数猜测幸运数字：");
            int num = s.nextInt();
            for (int i = 0; i < data.length; i++) {
                data[i] = r.nextInt(1, 20);
                if (data[i] == num) {
                    System.out.println("运去不错，猜中了");
                    System.out.println(i);
                    break LOOP;
                }
            }
            System.out.println("未命中");
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
