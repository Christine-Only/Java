package com.christine.dy26_Collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * <strong>可变参数</strong>
     * <li>可变参数用在形参中可以接收多个数据</li>
     * <li>可变参数的格式：数据类型…参数名称</li>
     * <br/>
     *
     * <strong>可变参数的作用</strong>
     * <li>传输参数非常灵活，方便。可以不传输参数，可以传输1个或者多个，也可以传输一个数组</li>
     * <li>可变参数在方法内部本质就是一个数组</li>
     * <br/>
     *
     * <strong>可变参数的注意事项</strong>
     * <li>一个形参列表中可变参数只能有一个</li>
     * <li>可变参数必须放在形参列表的最后面</li>
     */
    public static void main(String[] args) {
        sum(); // 0
        sum(1,2,3); // 3
        sum(new int[3]); // 3
        sum(new int[]{10, 20, 45, 89}); // 4
    }

    public static void sum(int ...params) {
        // 注意：可变参数在函数内部是一个数组
        System.out.println(params.length);
    }
}
