package com.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.model.Student;

public class Test {
    public static void main(String[] args) {
    	
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rushi", 85.5f));
        students.add(new Student(2, "Uday", 92.0f));
        students.add(new Student(3, "Om", 78.0f));
        students.add(new Student(4, "Vinit", 88.5f));
        students.add(new Student(5, "Sachin", 91.0f));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getRoll(), s1.getRoll());
            }
        });

        System.out.println("Marks in descending order:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
