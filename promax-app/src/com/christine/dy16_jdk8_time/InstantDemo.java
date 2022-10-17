package com.christine.dy16_jdk8_time;

import java.time.Instant;
import java.time.ZoneId;

public class InstantDemo {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(instant.atZone(ZoneId.systemDefault()));
    }
}
