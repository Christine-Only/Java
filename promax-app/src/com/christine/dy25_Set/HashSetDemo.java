package com.christine.dy25_Set;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. 如果希望元素可以重复，有索引，索引查询快？
 * 用ArrayList集合，基于数组的。
 * 2. 如果希望元素可以重复，有索引，增删收尾操作快？
 * 用LinkedList集合，基于链表的。
 * 3. 如果希望增删改查都快，但元素不重复、无索引、无序？
 * 用HashSet集合，基于哈希表的。
 * 4. 如果希望增删改查都快，但元素不重复、无索引、有序？
 * 用LinkedHashSet集合，基于哈希表和双链表的。
 * 5. 如果要对对象进行排序？
 * 用TreeSet集合，基于红黑树的。后续也可以使用List集合实现排序。
 *
 * <strong>HashSet去重原理解析</strong>
 *
 * <li>1. 创建一个默认长度为16的数组，数组名为table</li>
 * <li>2. 根据元素的哈希值跟数组的长度求余计算出应存入的位置（哈希算法）</li>
 * <li>3. 判断当前位置是否为null，如果是null直接存入</li>
 * <li>4. 如果位置不为null，表示有元素，则调用equals方法比较</li>
 * <li>5. 如果一样，则不存；如果不一样，则放到元素对应的链表中，如果链表长度大于8，就转化为红黑树，如果容量不够，则需扩容。</li>

 * <strong>结论：如果希望Set集合认为2个内容一样的对象是重复的，必须重写对象的hashCode()和equals()方法。</strong>
 */

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>(); // 无序 不重复 无索引
        sets.add("JAVA");
        sets.add("HTML");
        sets.add("Css");
        sets.add("JAVA");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets); // [JAVA, Css, HTML, SpringBoot]
    }
}
