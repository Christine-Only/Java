package com.christine.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请你输入机票的原价：");
        double money = s.nextDouble();

        System.out.println("请你输入机票的月份(1-12)：");
        int month = s.nextInt();

        System.out.println("请你属于机票的仓位类型：");
        String type = s.next();

        System.out.println("机票优惠后的价格是：" + price(money, month, type));

    }

    public static double price(double money, int month, String type) {
        if ( month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    return 0.9 * money;
                case "经济舱":
                    return 0.85 * money;
                default:
                    System.out.println("你输入的仓位信息有误~~~");
                    return -1;
            }
        } else if(month == 11 || month == 12 || month >= 1 && month <=4) {
            switch (type) {
                case "头等舱":
                    return 0.7 * money;
                case "经济舱":
                    return 0.65 * money;
                default:
                    System.out.println("你输入的仓位信息有误~~~");
                    return -1;
            }
        } else {
            System.out.println("你输入的月份有误~~~");
            return -1;
        }
    }
}
