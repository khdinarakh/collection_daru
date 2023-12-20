package com.company.firstAndLastElement;

import java.util.Collections;
import java.util.LinkedList;

public class FirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");


        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //replace

        Collections.swap(list, 0, 1);
        System.out.println("First and second are swapped: " + list);

    }
}
