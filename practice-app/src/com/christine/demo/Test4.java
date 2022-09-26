package com.christine.demo;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 评委给学分打分
        System.out.println("该选手平均分为：" + calcScore(5));
    }

    public static double calcScore(int n) {
        int[] scores = new int[n];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("请第" + (i + 1) + "位评委输入打分：");
            int score = s.nextInt();
            scores[i] = score;
        }

        int maxScore = scores[0];
        int minScore = scores[0];

        int totalScore = 0;

        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > maxScore) {
                maxScore = scores[i];
            }

            if(scores[i] < minScore) {
                minScore = scores[i];
            }

            totalScore += scores[i];
        }

//        for (int i = 0; i < scores.length; i++) {
//            if(scores[i] == maxScore || scores[i] == minScore) {
//                continue;
//            }
//            totalScore += scores[i];
//        }
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分：" + minScore);

        return (totalScore - minScore - maxScore) * 1.0 / (n - 2);

    }
}
