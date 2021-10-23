package com.company.DSA__JAVA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class StringInJava {
    public static void main(String[] args) {
        String a = "Kunal Patil";
        String b = a;
        System.out.println(a);
        System.out.println(b);

        String c = "Kunal";
        String d = "Kunal";
        System.out.println(c==d);

        String e = new String("Kunal");
        System.out.println(e==d);

        System.out.println(d.equals(e));

        System.out.println(07);
        System.out.println("Kunal");
        System.out.println(new  int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(new  int[]{1,2,3,4,5}));

        //String Concatenation:
        System.out.println("K" + 'a');
        System.out.println('a' + 1); // == 98
        System.out.println((char)('a' + 1));
        System.out.println("K" + 1);
        System.out.println("K" + new ArrayList<Integer>());
    }
}
