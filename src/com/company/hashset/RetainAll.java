package com.company.hashset;

import java.util.HashSet;
import java.util.Set;

public class RetainAll {
    public static void main(String[] args) {
       Set<Integer> set1 = new HashSet<>();
       Set<Integer> set2 = new HashSet<>();

       set1.add(1);
       set1.add(2);
       set1.add(3);

        set2.add(4);
        set2.add(2);
        set2.add(1);

        System.out.println("First set: " + set1);
        System.out.println("Second set: " + set2);

        set1.retainAll(set2);

        System.out.println("Set after retaining both(set1 and set2): " + set1);
    }
}
