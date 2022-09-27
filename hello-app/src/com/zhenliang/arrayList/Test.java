package com.zhenliang.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        System.out.println(studentArrayList);
        studentArrayList.add(new Student("202200926", "Chris", 18, "一班"));
        studentArrayList.add(new Student("202200927", "Picker", 28, "二班"));
        studentArrayList.add(new Student("202200928", "Fiona", 18, "三班"));
        studentArrayList.add(new Student("2022009279", "Roger", 26, "四班"));
        System.out.println(studentArrayList); // 数组中存放的是引用地址
        System.out.println("学号\t\t\t姓名\t\t年龄\t班级");
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student s = studentArrayList.get(i);
            System.out.println(s.getStuNum()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getClassName());
        }

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("请输入你要查询的学号：");
            String inputNum = sc.next();
            Student s = getStudentByStuNum(inputNum, studentArrayList);
            if(s != null) {
                System.out.println(s.getStuNum()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getClassName());
            } else {
                System.out.println("查无此人！！！");
            }
        }
    }

    public static Student getStudentByStuNum(String stuNum, ArrayList<Student> studentArrayList) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student s = studentArrayList.get(i);
            if (stuNum.equals(s.getStuNum())) {
                return s;
            }
        }
        return null;
    }

}
