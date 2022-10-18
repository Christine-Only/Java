package com.christine.dy18_regex;

public class RegexDemo {
    public static void main(String[] args) {
        // 必须是数字 字母 下划线 至少6位
        System.out.println(checkPassword(null)); // false
        System.out.println(checkPassword("123456_")); // true
        System.out.println(checkPassword("Chris_666")); // true
        System.out.println(checkPassword("Chris")); // false

        // 必须是数字和字符 必须是4位
        System.out.println("23F5".matches("[a-zA-Z0-9]{4}"));
        System.out.println("F".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23".matches("[a-zA-Z0-9]{4}"));
        System.out.println("2_".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23F5".matches("[\\w&&[^_]]{4}"));
    }

    public static boolean checkPassword(String password) {
        return password != null && password.matches("\\w{6,}");
    }
}
