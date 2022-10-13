package com.christine.dy9_polymorphic;

public class Test {
    public static void main(String[] args) {
        /**
         * 多态定义格式：父类类型 变量名=new 子类类型();
         * 多态成员变量：编译运行看左边
         * 多态成员方法：编译看左边，运行看右边
         */
        Computer c = new Computer();

        /**
         * 多态类型转换
         * 向上转型（自动类型装换）
         * 子类型转换成父类型
         *
         * 向下转型（强制类型装换）
         * 父类型转换成子类型
         */
        USB u = new Keyboard("双飞燕");
        c.installUSB(u);

        USB u2 = new Mouse("罗技");
        c.installUSB(u2);
    }
}
