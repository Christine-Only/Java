package com.christine.dy16_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime newTime = LocalTime.now();
        System.out.println(newTime);

        // 获取小时
        System.out.println(newTime.getHour());

        // 获取分钟
        System.out.println(newTime.getMinute());

        // 获取秒
        System.out.println(newTime.getSecond());

        System.out.println(newTime.minusMinutes(10));
        System.out.println(newTime.plusHours(2));

        LocalTime before = LocalTime.parse("10:51:01.167526700");
        LocalTime after = LocalTime.parse("15:51:01.167526700");

        System.out.println(before.isAfter(after));
        System.out.println(before.isBefore(after));

        LocalDate myDate = LocalDate.of(2023,2,28);
        LocalDate nowDate = LocalDate.now();
        LocalDate nowDate2 = LocalDate.now();
        System.out.println(myDate.equals(nowDate));
        System.out.println(nowDate.equals(nowDate2));

        // 判断今天是你的生日
        LocalDate birthDate = LocalDate.of(1995,5,10);
        LocalDate date = LocalDate.now();

        MonthDay birthMd = MonthDay.of(birthDate.getMonthValue(), birthDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(date);

        System.out.println("今天是你的生日吗？" + birthMd.equals(nowMd));
    }
}
