package com.christine.dy16_jdk8_time;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        // 获取本地日期对象
        LocalDate newDate = LocalDate.now();
        System.out.println(newDate); // 2022-10-17

        System.out.println(newDate.getDayOfMonth()); // 17

        // 当前的第几天
        System.out.println(newDate.getDayOfYear()); // 290

        // 星期
        System.out.println(newDate.getDayOfWeek()); // MONDAY

        // 月份
        System.out.println(newDate.getMonth()); // OCTOBER
        System.out.println(newDate.getMonthValue()); // 10

        // 年份
        System.out.println(newDate.getYear()); // 2022
    }
}
