package com.christine.demo;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 生成随机验证码
        System.out.println("随机验证码code：" + createCode(8));
    }

    public static String createCode( int n ) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int number = r.nextInt(3);
            switch (number) {
                case 0:
                    char v = (char)r.nextInt(65, 91);
                    code += v;
                    break;
                case 1:
                    char v1 = (char)r.nextInt(97, 123);
                    code += v1;
                    break;
                case 2:
                    int v2 = r.nextInt(9);
                    code += v2;
                    break;
            }
        }
        return code;
    }
}
