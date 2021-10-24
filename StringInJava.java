package com.company.DSA__JAVA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

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

        // String Concatenation:
        System.out.println("K" + 'a');
        System.out.println('a' + 1); // == 98
        System.out.println((char)('a' + 1));
        System.out.println("K" + 1);
        System.out.println("K" + new ArrayList<Integer>());

        // StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("Kunal");
        System.out.println(builder);

        // String Methods
        String name = "Kunal Patil Hello World!!";
        System.out.println(name.charAt(0)); // K
        System.out.println(name.toLowerCase()); // kunal patil hello world!!
        System.out.println(name.toUpperCase()); // KUNAL PATIL HELLO WORLD!!
        System.out.println(name.length());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('l'));
        System.out.println(name.lastIndexOf('l'));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("          Kunal    ".strip());
    }
}
