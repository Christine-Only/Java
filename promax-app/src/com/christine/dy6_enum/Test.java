package com.christine.dy6_enum;

public class Test {

    public static void main(String[] args) {
        COLOR r = COLOR.RED;
        System.out.println(r);

        iterateEnum();
        switchEnum(COLOR.GREEN);
    }

    public enum COLOR {
        RED, GREEN, BLUE
    }

    // 迭代枚举元素

    /**
     * values() 返回枚举类中所有的值
     * ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
     * valueOf()方法返回指定字符串值的枚举常量。
     */
    public static void iterateEnum() {
        COLOR[] colors = COLOR.values();
        for (COLOR r: colors) {
            System.out.println(r + " at index " + r.ordinal());
        }
        System.out.println(COLOR.valueOf("BLUE"));
    }

    // 在 switch 中使用枚举类
    public static void switchEnum(COLOR o) {
        switch (o) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
    }
}
