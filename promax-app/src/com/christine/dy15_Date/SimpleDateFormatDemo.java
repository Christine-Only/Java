package com.christine.dy15_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        // EEE 周几
        // a 上午或下午
        String pattern = "yyyy-MM-dd HH:mm:ss EEE a";
        SimpleDateFormat s = new SimpleDateFormat(pattern);
        System.out.println(s.format(date));

        String str = "2022年10月12日 12:12:12";
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // 往后走2天14小时49分06秒后的时间是多少
        Date date2 = s2.parse(str);
        System.out.println(date2);
        long time = date2.getTime();
        time += (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;
        date2.setTime(time);
        System.out.println("走2天14小时49分06秒后的时间是：" + date2);
        System.out.println(s2.format(date2));
    }
}
