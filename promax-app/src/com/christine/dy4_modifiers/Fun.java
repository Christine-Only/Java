package com.christine.dy4_modifiers;

public class Fun {
    // 只能在当类中使用
    private void privateMethod() {
        System.out.println("===private===");
    }

    // 只能在本包和当前类中访问。
    void method() {
        System.out.println("===default===");
    }

    // 当前类或子类可以访问，同时相同包内的其他类也可以访问protected成员
    protected void protectedMethod() {
        System.out.println("===protected===");
    }

    // 所有其他类都可以访问
    public void publicMethod() {
        System.out.println("===public===");
    }

    public static void main(String[] args) {
        Fun f = new Fun();
        f.publicMethod();
        f.method();
        f.protectedMethod();
        f.privateMethod();
    }
}
