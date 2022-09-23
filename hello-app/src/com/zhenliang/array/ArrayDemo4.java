package com.zhenliang.array;

import java.util.Random;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Random r = new Random();

        int ids[] = {22, 33, 35, 13, 88};

        for (int i = 0; i < ids.length; i++) {
            System.out.print(ids[i] + " ");
        }

        for (int i = 0; i < ids.length; i++) {
            int randomNum = r.nextInt(ids.length);
            int temp = ids[i];
            ids[i] = ids[randomNum];
            ids[randomNum] =  temp;
        }

    }
}
