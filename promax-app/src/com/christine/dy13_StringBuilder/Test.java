package com.christine.dy13_StringBuilder;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arrayTransformString(arr));

        int[] arr2 = {10,20,30,40,50};
        System.out.println(arrayTransformString(arr2));

        System.out.println(arrayTransformString(null));
    }

    public static String arrayTransformString(int[] arr) {
        if (arr == null) {
            return null;
        } else {
            StringBuilder s = new StringBuilder("[");
            // StringBuffer s = new StringBuffer("[");
            for (int i = 0; i < arr.length; i++) {
                String str = i == arr.length - 1 ? arr[i] + "" : arr[i] + ", ";
                s.append(str);
            }
            s.append("]");
            return s.toString();
        }
    }
}
