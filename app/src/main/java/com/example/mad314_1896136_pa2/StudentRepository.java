package com.example.mad314_1896136_pa2;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static StudentRepository instance = null;
    private List<Student> students = new ArrayList<>();

    private StudentRepository() {
        Student student = new Student();
        student.id = 1;
        student.name = "Yash";
        student.password = "Admin1";
        this.students.add(student);

       Student student2 = new Student();
        student2.id = 2;
        student2.name = "Akshay";
        student2.password = "Admin2";
        this.students.add(student2);

        Student student3 = new Student();
        student3.id = 3;
        student3.name = "Sam";
        student3.password = "Admin3";
        this.students.add(student3);

        Student student4 = new Student();
        student4.id = 4;
        student4.name = "John";
        student4.password = "Admin4";
        this.students.add(student4);

        Student student5 = new Student();
        student5.id = 5;
        student5.name = "Arnold";
        student5.password = "Admin5";
        this.students.add(student5);

        Student student6 = new Student();
        student6.id = 6;
        student6.name = "Stelon";
        student6.password = "Admin6";
        this.students.add(student6);

        Student student7 = new Student();
        student7.id = 7;
        student7.name = "Craig";
        student7.password = "Admin7";
        this.students.add(student7);

        Student student8 = new Student();
        student8.id = 8;
        student8.name = "Mike";
        student8.password = "Admin8";
        this.students.add(student8);

        Student student9 = new Student();
        student9.id = 9;
        student9.name = "Tom";
        student9.password = "Admin9";
        this.students.add(student9);

        Student student10 = new Student();
        student10.id = 10;
        student10.name = "Daniel";
        student10.password = "Admin10";
        this.students.add(student10);
    }


    public static StudentRepository getInstance() {
        if (instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public List<Student> getStudents()
    {
        return this.students;
    }
}
