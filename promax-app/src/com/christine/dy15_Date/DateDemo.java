package com.christine.dy15_Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("--------当前时间----------");
        System.out.println(d);

        System.out.println(d.getTime()); // 获取时间戳
        System.out.println(System.currentTimeMillis()); // 获取当前系统的毫秒值

        // 获取当前时间往后走1小时121秒
        long time = System.currentTimeMillis();
        time += (60 * 60 + 121) * 1000;
        d.setTime(time);
        System.out.println("--------当前时间往后走1小时121秒后的时间----------");
        System.out.println(d);
    }
}
