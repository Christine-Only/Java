package com.christine.dy16_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(dateTime));
        System.out.println(dateTime.format(dtf));

        // 解析字符串时间
        LocalDateTime ldt = LocalDateTime.parse("2022-05-24 15:16:30", dtf);
        System.out.println(ldt);
    }
}
