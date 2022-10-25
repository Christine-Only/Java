package com.christine.dy25_Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkSets = new LinkedHashSet<>();
        linkSets.add("JAVA");
        linkSets.add("Css");
        linkSets.add("JAVA");
        linkSets.add("HTML");
        linkSets.add("HTML");
        linkSets.add("SpringBoot");
        linkSets.add("SpringBoot");
        System.out.println(linkSets); // [JAVA, Css, HTML, SpringBoot]
    }
}