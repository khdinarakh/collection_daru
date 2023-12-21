package com.company.tryCatch;

import java.util.ArrayList;
import java.util.List;

public class NumbersSum {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("10");
        myList.add("1");
        myList.add("30");

        List<Integer> myIntegerList = new ArrayList<>();

        try {
            for (String myInt : myList) {
                myIntegerList.add(Integer.valueOf(myInt));
            }
            System.out.println(sum(myIntegerList));
        }catch (NumberFormatException e){
            System.out.println("It is not a number");
        }
    }

    public static int sum(List<Integer> numbers){
        int sum = 0;
        for (Integer number : numbers){
            sum += number;
        }
        return sum;
    }



}
