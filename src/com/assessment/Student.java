package com.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person{

    private String username;
    private String password;
    private HashMap<String, Double> grades = new HashMap<String, Double>();
    private ArrayList<Courses> timetable = new ArrayList<Courses>();



    public Student (String first_name, String last_name, String emailAddress, String password, String username) {
        super (first_name, last_name, emailAddress);
        this.password = password;
        this.username = username;
    }



    public String getUsername() {
        return username;
    }



    public String getPassword() {
        return password;
    }



    public HashMap<String, Double> getGrades() {
        return grades;
    }



    public ArrayList<Courses> getTimetable() {
        return timetable;
    }

    void print_grades() {


        System.out.println(getFirst_name() + " " + getLast_name() + " grades:");
        System.out.println("----------------------");

        for (Map.Entry<String, Double> entry : getGrades().entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }

    void print_timetable () {


        System.out.println(getFirst_name() + " " + getLast_name() + " Timetable:");
        System.out.println("----------------------\n\n");

        for (int i = 0; i < getTimetable().size(); i++) {
            System.out.println("Tutor: " + getTimetable().get(i).getTutor().getFirst_name() + " " + getTimetable().get(i).getTutor().getLast_name());
            System.out.println("Subject: " + getTimetable().get(i).getTutor().getSubject());
            System.out.println("----------------------");
        }

    }



}