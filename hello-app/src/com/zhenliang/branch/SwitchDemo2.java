package com.zhenliang.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        int month = 2;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月份是31天!");
                break;
            case 2:
                System.out.println("平年" + month + "月是28天!, 闰年" + month + "月是29天!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月份是30天!");
                break;
            default:
                System.out.println("数据格式有误！");
        }
    }
}
