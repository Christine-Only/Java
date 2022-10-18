package com.christine.dy17_packagingClass;

public class Demo {
    public static void main(String[] args) {
        String str = "99";
        Integer i = Integer.valueOf(str);
        Integer i2 = Integer.parseInt(str);
        System.out.println(i);
        System.out.println(i2);

        String str2 = "99.99";
        Double d = Double.valueOf(str2);
        System.out.println(d);
        Double d2 = Double.parseDouble(str2);
        System.out.println(d2);
    }
}
