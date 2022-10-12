package com.christine.dy7_abstract;

public abstract class Employee {
    /**
     * 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
     * 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
     * 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
     * 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
     * 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
     */
    private String name;
    private int age;
    private String address;

    public abstract double calcPay();

    public Employee() {
    }

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
