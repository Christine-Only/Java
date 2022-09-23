package com.zhenliang.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] members = {16, 26, 36, 6, 100};

        int total = 0;

        for (int i = 0; i < members.length; i++) {
            total += members[i];
        }

        System.out.println(total);

        int[] faces = {15, 30, 2, 78, 34};

        int max = faces[0];

        for (int i = 1; i < faces.length; i++) {
            if (faces[i] > max) {
                max = faces[i];
            }
        }

        System.out.println(max);
    }
}
