package com.zhenliang.loop;

import java.util.Scanner;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        Scanner s = new Scanner(System.in);

        int luckNum = r.nextInt(100) + 1;

        while (true) {
            System.out.println("请输入幸运数字：");
            int num = s.nextInt();

            if(num > luckNum) {
                System.out.println("猜测的值大了");
            } else if (num < luckNum) {
                System.out.println("猜测的值小了");
            } else {
                System.out.println("恭喜你猜对啦，你如此幸运哦~~~");
                break;
            }
        }
    }
}
