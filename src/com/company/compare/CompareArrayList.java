package com.company.compare;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");

        System.out.println("Lists equals: " + compareLists(list, list1));

        System.out.println("Make changes");

        //list1.add("two");
        //list.add("one");

        System.out.println("Is equal after changing: " + compareLists(list, list1));
    }

    public static boolean compareLists(ArrayList<String> list, ArrayList<String> list1) {
        //Check if both lists are the same object
        if (list1 == list) {
            return true;
        }

        if (list.size() != list1.size()) {
            return false;
        }

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list1.get(i))) {
                return false;
            }
        }
        return true;
    }

}
