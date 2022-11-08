package com.christine.dy29_Stream;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("小红", '女', 20000.00, 16000, "暂无"));
        list.add(new Employee("小命", '男', 26400.00, 10000, "暂无"));
        list.add(new Employee("小兰", '女', 12000.00, 20000, "暂无"));
        list.add(new Employee("小花", '女', 8000.00, 4000, "暂无"));

        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("小小", '女', 25000.00, 16000, "暂无"));
        list2.add(new Employee("大大", '男', 36400.00, 10000, "暂无"));
        list2.add(new Employee("嘿嘿", '女', 16000.00, 20000, "暂无"));
        list2.add(new Employee("好好", '女', 8780.00, 4000, "暂无"));
        list2.add(new Employee("坏蛋", '男', 38000.00, 24000, "暂无"));

//        Employee t = list.stream().max((a, b) -> Double.compare(a.getSalary() + a.getBonus(), b.getSalary() + b.getBonus())).get();
//        System.out.println(t);
        TopperFormer t = list.stream().max((a, b) -> Double.compare(a.getSalary() + a.getBonus(), b.getSalary() + b.getBonus())).map(s -> new TopperFormer(s.getName(), s.getSalary() + s.getBonus()))
                .get();
        System.out.println(t);
    }
}
