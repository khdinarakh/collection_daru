package com.company;


import com.company.arrayListColor.Colors;
import com.company.colors.Colours;
import com.company.student.Student;
import com.company.week.Weekday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Colours.print();

        Weekday.printDayInfo(Weekday.FRIDAY);

        Student student1 = new Student(12);
        Student student2 = new Student(1);
        Student student3 = new Student(10);
        Student student4 = new Student(11);
        Student student5 = new Student(9);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student: students) {
            System.out.println("Student grades: " + student.getGrade());
        }

        //second way
        Iterator<Student> allStudent = students.listIterator();
        while (allStudent.hasNext()){
            Student student = allStudent.next();
            System.out.println("(Iterator)Student grade: " + student.getGrade());
        }

        ArrayList<Colors> allColor = new ArrayList<>();
        allColor.add(new Colors("Red"));
        allColor.add(new Colors("Green"));
        allColor.add(new Colors("Blue"));
        allColor.add(new Colors("Yellow"));
        allColor.add(new Colors("Purple"));

        Colors.print(allColor);




    }
}
