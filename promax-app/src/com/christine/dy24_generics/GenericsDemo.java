package com.christine.dy24_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        /**
         * ?: 通配符
         * ? 可以在使用泛型时代表一切类型
         * ? extends Car: ?必须是Car或者其子类
         */
        List<Bmw> bmws = new ArrayList<>();
        bmws.add(new Bmw());
        bmws.add(new Bmw());
        bmws.add(new Bmw());
        go(bmws);

        List<Benz> benz = new ArrayList<>();
        benz.add(new Benz());
        benz.add(new Benz());
        benz.add(new Benz());
        go(benz);
    }

    public static void go(List<? extends Car> cars) {

    }
}

class Car{

}

class Bmw extends Car {

}

class Benz extends Car {

}




