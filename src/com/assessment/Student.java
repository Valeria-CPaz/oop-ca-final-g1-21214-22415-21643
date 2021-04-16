package com.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person{

    private HashMap<String, Double> grades = new HashMap<String, Double>();
    private ArrayList<Module> timetable = new ArrayList<>();
    private ArrayList<Double> fees = new ArrayList<>();
    private CollegeBranch collegeBranch;
    private Course course;
    private boolean isPaidFull;

    public Student(String first_name, String last_name, String gender, String phone, String dob,
                   String emailAddress, String username, String password, CollegeBranch collegeBranch, Course course, boolean isPaidFull) {
        super(first_name, last_name, gender, phone, dob, emailAddress, username, password);
        this.collegeBranch = collegeBranch;
        this.course = course;
        this.isPaidFull = isPaidFull;
        setInstallments(6);
    }

    public Student(String first_name, String last_name) {
        super(first_name, last_name);


    }

    public CollegeBranch getCollegeBranch() {
        return collegeBranch;
    }

    public HashMap<String, Double> getGrades() {
        return grades;
    }

    public ArrayList<Double> getFees() {
        return fees;
    }

    public Course getCourse() {
        return course;
    }

    public boolean isPaidFull() {
        return isPaidFull;
    }

    public ArrayList<Module> getTimetable() {
        return timetable;
    }

    public void printTimetable(){
        System.out.println("--- TIMETABLE ---");
        for (int i = 0; i < getTimetable().size(); i++){
            System.out.println(getTimetable().get(i).getSubject()+": " + getTimetable().get(i).getClassHour());
        }
    }

    public void printGrades(){

        System.out.println(getFirstName() + " " + getLastName() + " grades:");
        System.out.println("----------------------");

        for (Map.Entry<String, Double> entry : getGrades().entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    // FEES MANAGEMENT
    private void setInstallments(int installments){

        if(isPaidFull()){
            for (int i = 0; i < installments; i++) {
                getFees().add(0.0);
            }
        } else {
            Double installment = getCourse().getPrice() / installments;

            for (int i = 0; i < installments; i++) {
                getFees().add(installment);
            }
        }

    }

    public void printFees(){
        int count = 0;
        for (Double a : getFees()){
            if (a!=0){
                count++;
            }
        }

        if(count == 0){
            System.out.println("ALL FEES ARE PAID!");
        } else {
            for (int i = 1; i<= getFees().size(); i++){
                System.out.println("Fee " + i + ": €" + getFees().get(i-1));
            }
        }

    }
}