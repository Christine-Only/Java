package com.zhenliang.branch;

public class IfDemo {
    public static void main(String[] args) {
        double money = 6666;

        if (money >= 1314) {
            System.out.println("余额充足");
        } else {
            System.out.println("余额不足");
        }

        int heartBeat = 30;
        if(heartBeat < 60 || heartBeat > 100) {
            System.out.println("您的心跳异常啦");
        }
        System.out.println("检查结束");
    }
}
