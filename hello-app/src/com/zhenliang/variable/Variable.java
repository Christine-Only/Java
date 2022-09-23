package com.zhenliang.variable;

public class Variable {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 2;
        byte c = (byte) (a + b);
        byte rs = a += b;
        System.out.println(rs);

        System.out.println(c);

        char d = 'a';
        int e = d + 2;
        System.out.println(e);
    }
}
