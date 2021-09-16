package com.company.DSA__JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArr {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

//        User Inputs:
//        for (int i = 0; i < 5; i++){
//            list.add(in.nextInt());
//        }
//
//        for (int i = 0; i < 5; i++){
//            System.out.println(list.get(i));
//        }

//        System.out.println(list);


        list.add(3);
        list.add(4);
        list.add(89);
        list.add(34);
        list.add(78);
        list.add(9);
        list.add(88);
        list.add(23);

        System.out.println(list);

//      List functions:

        System.out.println(list.get(2));

        list.set(3, 99);
        System.out.println(list);

        System.out.println(list.indexOf(78));

        list.remove(7);
        System.out.println(list);

        System.out.println(list.contains(9));
        System.out.println(list.contains(10));

    }
}
