package com.zhenliang.literal;

public class VariableDemo {
    public static void main(String[] args) {
        //   整型
        //   byte 占1个字节
        byte num = 127;

        //   short 占2个字节
        short num2 = 3567;

        //   int 整型 默认的类型 占4个字节
        int num3 = 567890;

        //   long 占8个字节 随便写一个整数 默认类型为int 如果希望随便写一个整数字面量当成long类型 需要在其后面添加L/l
        long num4 = 1234567899888823L;

        //   浮点型
        //   float 单精度 占4个字节 随便写一个小数字面量默认是double类型 如果希望随便写一个小数字面量当成float类型 需要在其后面添加F/l
        float a = 999.88F;

        //   double 双精度 占8个字节
        double b = 999888.99;

        //   字符类型
        char c = '中';
        //   char c = '中国'; 报错

        //   布尔类型
        boolean d = true;

        //   引用数据类型
        String name = "tsy";
        String englishName = "Christine";

        //   强制类型转换
        double score = 99.5;
        int newScore = (int) score;

        //   两个整数相除结果一定是整数
        System.out.println(10 / 3); // 3
        System.out.println(1.0 * 10 / 3); // 3.3333333333333335
    }
}
