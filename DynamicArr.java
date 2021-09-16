package com.company.DSA__JAVA;

import java.util.ArrayList;

public class DynamicArr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(3);
        list.add(4);
        list.add(89);
        list.add(34);
        list.add(78);
        list.add(9);
        list.add(88);
        list.add(23);

        System.out.println(list);

        System.out.println(list.get(2));

        list.set(3, 99);
        System.out.println(list);

        System.out.println(list.indexOf(78));

        list.remove(7);
        System.out.println(list);

    }
}
