package com.company.secondElement;

import java.util.ArrayList;

public class ChangingSecondElement {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("second");
        myList.add("third");

        System.out.println(myList);

        System.out.println("Changing second element");

        myList.set(1, "2");

        System.out.println(myList);

    }
}
