package com.zhenliang.branch;

public class SwitchDemo {
    public static void main(String[] args) {
        String weekday = "周一";
        switch (weekday) {
            case "周一":
                System.out.println("周一");
                break;
            case "周二":
                System.out.println("周二");
                break;
            case "周三":
                System.out.println("周三");
                break;
            case "周四":
                System.out.println("周四");
                break;
            case "周五":
                System.out.println("周五");
                break;
            case "周六":
                System.out.println("周六");
                break;
            case "周日":
                System.out.println("周日");
                break;
            default:
                System.out.println("传入参数有误！");
                break;
        }
    }
}
