package com.christine.dy12_api;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Equals s = new Equals("Christine", 18);
        Equals s2 = new Equals("Christine", 18);

        System.out.println(s.toString());
        System.out.println(Objects.equals(s, s2));
        System.out.println(s.equals(null));
        System.out.println(s.equals(s2));
    }
}
