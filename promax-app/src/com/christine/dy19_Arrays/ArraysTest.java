package com.christine.dy19_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Christine", 18, 160.6);
        students[1] = new Student("Picker", 28, 178.0);
        students[2] = new Student("Jack", 22, 175.5);

        System.out.println(Arrays.toString(students));

        /**
         * Double.compare 比较两个指定的double值
         */
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // return o1.getAge() - o2.getAge();
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });

        System.out.println(Arrays.toString(students));
    }
}
