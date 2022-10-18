package com.christine.dy16_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime birthDate = LocalDateTime.of(1991, 6, 26, 8, 15, 30);

        Duration d = Duration.between(birthDate, dateTime);
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
        System.out.println(d.toSeconds());
    }
}
