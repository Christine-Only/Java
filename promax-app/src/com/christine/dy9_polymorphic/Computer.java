package com.christine.dy9_polymorphic;

public class Computer {
    public void installUSB(USB u) {
        u.connect();
        u.unplug();

        if(u instanceof Keyboard) {
            // 强制类型转换
            ((Keyboard) u).typing();
        } else if (u instanceof Mouse) {
            ((Mouse) u).click();
        }
    }
}
