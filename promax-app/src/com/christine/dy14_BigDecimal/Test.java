package com.christine.dy14_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(0.1);
        BigDecimal b = BigDecimal.valueOf(0.2);
        System.out.println(a.add(b));
        System.out.println(0.2 + 0.1);
        System.out.println(1.0 + 2.0);

        BigDecimal c = BigDecimal.valueOf(10.0);
        BigDecimal d = BigDecimal.valueOf(3.0);
        System.out.println(c.divide(d, 2, RoundingMode.HALF_UP));
    }
}
