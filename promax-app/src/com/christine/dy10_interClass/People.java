package com.christine.dy10_interClass;

public class People {
    private int heartBeat = 150;

    public class Heart {
        private int heartBeat = 110;

        public void show() {
            int heartBeat = 10;
            System.out.println(heartBeat); // 10
            System.out.println(this.heartBeat); // 110
            System.out.println(People.this.heartBeat); // 150

            // tips: 在成员内部类中访问所在外部类对象，格式：外部类名.this。
        }
    }
}
