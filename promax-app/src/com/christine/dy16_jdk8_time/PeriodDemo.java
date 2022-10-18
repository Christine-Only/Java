package com.christine.dy16_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();

        LocalDate birthDate = LocalDate.of(1994,5,10);

        // Period 用来计算日期间隔
        Period period = Period.between(birthDate, nowDate);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("Christine已经出生" + period.getYears() + "年" + period.getMonths() + "个月" + period.getDays() + "天啦！");

    }
}
