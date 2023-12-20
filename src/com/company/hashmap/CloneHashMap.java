package com.company.hashmap;

import java.util.HashMap;

public class CloneHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();

        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");

        map2.put(4, "four");
        map2.put(5, "five");
        map2.put(6, "six");

        System.out.println("First map: " + map1);
        System.out.println("Second map: " + map2);

        map2.putAll(map1);
        System.out.println("Copied map2 from map1: " + map2);
        System.out.println(map1.isEmpty());

        map1.clear();

        System.out.println("After clearing: " + map1.isEmpty());
    }

}
