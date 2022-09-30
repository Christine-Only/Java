package com.christine.dy1_static;

public class CodeBlock {
    public static String name;

    /**
     * 静态代码块：有static修饰，属于类，与类一起优先加载一次，自动触发执行。
     * 作用：可以用于初始化静态资源。
     */
    static {
        name = "Christine";
        System.out.println("====静态代码块被触发执行了====");
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("====main方法执行了====");

        CodeBlock code = new CodeBlock();
    }

    /**
     * 实例代码块：无static修饰，属于对象，每次构建对象时，都会触发一次执行。
     */
    {
        System.out.println("====实例代码块被触发执行了====");
    }
}
