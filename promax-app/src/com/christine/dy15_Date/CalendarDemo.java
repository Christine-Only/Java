package com.christine.dy15_Date;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        // Calendar是可改变日期对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int day = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

//        cal.set(Calendar.DAY_OF_YEAR, 60);
//        System.out.println(cal);

        cal.add(Calendar.DAY_OF_YEAR, 6);
        cal.add(Calendar.MINUTE, 20);

        System.out.println(cal.getTime());

        System.out.println(cal.getTimeInMillis());
    }
}
