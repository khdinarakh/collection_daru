package com.company.arrayListColor;

import com.company.student.Student;

import java.util.ArrayList;

public class Colors {
    private String colors;

    public Colors() {
    }

    public Colors(String colors) {
        this.colors = colors;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public static void print(ArrayList<Colors> color){
        for (Colors colors : color) {
            System.out.println(colors.getColors());
        }
    }
}
