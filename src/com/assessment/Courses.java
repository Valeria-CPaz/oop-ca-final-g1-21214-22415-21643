package com.assessment;

import java.util.ArrayList;
import java.util.HashMap;

public class Courses {


    private Tutor tutor;
    private ArrayList<Student> list_of_students = new ArrayList<Student>();
    private HashMap<Student, Double[]> studentsGrades = new HashMap<Student, Double[]>();
    private CollegeBranch collegeBranch;


    public Courses(CollegeBranch collegeBranch, Tutor tutor) {
        this.tutor = tutor;
        this.collegeBranch = collegeBranch;

    }


    public ArrayList<Student> getList_of_students() {
        return list_of_students;
    }


    public Tutor getTutor() {
        return tutor;
    }


    public CollegeBranch getCollegeBranch() {
        return collegeBranch;
    }

}
