package com.christine.dy15_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String startTime = "2022年10月11日 0:0:0";
        String endTime = "2022年10月11日 0:10:0";
        String str = "2022年10月11日 0:03:47";
        String str2 = "2022年10月11日 0:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        long start = getTime(sdf, startTime);
//        long end = getTime(sdf, endTime);
//        long payTime = getTime(sdf, str);
//        long payTime2 = getTime(sdf, str2);
//        if (payTime >= start && payTime <= end) {
//            System.out.println("Christine参加了秒杀活动~");
//        } else {
//            System.out.println("Christine未参加秒杀活动~");
//        }
//
//        if (payTime2 >= start && payTime2 <= end) {
//            System.out.println("Picker参加了秒杀活动~");
//        } else {
//            System.out.println("Picker未参加秒杀活动~");
//        }
        Date start = sdf.parse(startTime);
        Date end = sdf.parse(endTime);
        Date payTime = sdf.parse(str);
        Date payTime2 = sdf.parse(str2);
        System.out.println(start);
        System.out.println(start.toString());
        if (payTime.after(start) && payTime.before(end)) {
            System.out.println("Christine参加了秒杀活动~");
        } else {
            System.out.println("Christine未参加秒杀活动~");
        }

        if (payTime2.after(start) && payTime2.before(end)) {
            System.out.println("Picker参加了秒杀活动~");
        } else {
            System.out.println("Picker未参加秒杀活动~");
        }

    }

//    public static long getTime(SimpleDateFormat sdf, String str) throws ParseException {
//        return sdf.parse(str).getTime();
//    }
}
