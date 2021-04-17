package com.assessment;

import java.util.ArrayList;

public class Admin extends Person {

    private Student student;
    private Lecturer lecturer;
    private CollegeBranch collegeBranch;
    private Module module;
    private Course course;
    private ArrayList<CollegeBranch> listOfBranches = new ArrayList<>();


    public Admin(String first_name, String last_name, String gender, String phone, String dob, String emailAddress, String username, String password) {
        super(first_name, last_name, gender, phone, dob, emailAddress, username, password);
    }

    public Admin(String first_name, String last_name) {
        super(first_name, last_name);
    }




    // CREATING BRANCHES, LECTURERS AND STUDENTS

    public CollegeBranch createBranch(String unit, String address) {

        collegeBranch = new CollegeBranch(unit, address);

        getListOfBranches().add(collegeBranch);

        return collegeBranch;

    }

    public Lecturer createLecturer(String first_name, String last_name, String gender, String phone, String dob, String emailAddress,
                                   String username, String password, Module module, CollegeBranch collegeBranch) throws Exception {

        lecturer = new Lecturer(first_name, last_name, gender, phone, dob, emailAddress, username, password, module, collegeBranch);
        module.getCourse().getListOfLecturersCourse().add(lecturer);
        collegeBranch.getListOfLecturers().add(lecturer);

        return lecturer;
    }

    public Lecturer createLecturer(String first_name, String last_name, CollegeBranch collegeBranch) {

        lecturer = new Lecturer(first_name, last_name, collegeBranch);

        return lecturer;
    }

    public Student createStudents(String first_name, String last_name, String gender, String phone, String dob,
                                  String emailAddress, String username, String password, CollegeBranch collegeBranch, Course course, boolean isPaidFull) {

        student = new Student(first_name, last_name, gender, phone, dob, emailAddress, username, password, collegeBranch, course, isPaidFull);
        module.getCourse().getListOfStudentsCourse().add(student);
        collegeBranch.getListOfStudents().add(student);
        return student;

    }

    public Student createStudents(String first_name, String last_name) {

        student = new Student(first_name, last_name);
        return student;

    }

    // CREATING MODULES AND COURSES - ADDING STUDENTS TO MODULES
    public Module createModule(String subject, Course course, CollegeBranch collegeBranch, String weekDay, String classHour) {
        module = new Module(subject, course, collegeBranch, weekDay, classHour);

        return module;
    }

    public Course createCourse(CollegeBranch collegeBranch, String name, Double price) {
        course = new Course(collegeBranch, name, price);
        return course;
    }

    public void addStudentToModule(Module module, Student s) throws Exception {


        if (module.getCourse().getCollegeBranch().getUnit().equalsIgnoreCase(s.getCollegeBranch().getUnit())) {
            module.getListOfStudentsModule().add(s);
            s.getTimetable().add(module);

        } else {
            throw new Exception("This module doesn't exist in this Branch" + s.getFirstName() + " " + module.getSubject());
        }


    }


    // GETTING AND PRINTING LIST OF BRANCHES

    public ArrayList<CollegeBranch> getListOfBranches() {
        return listOfBranches;
    }

    public void printListOfBranches(){
        for (CollegeBranch cb : getListOfBranches()){
            System.out.println("Branch " + cb.getUnit() + "\nLocated at: " + cb.getAddress());
        }
    }


    // DELETING STUDENTS, LECTURERES AND BRANCHES

    public void deleteStudent(String studentUsername, CollegeBranch cb){

        int counting = 0;

        for (int i = 0; i < collegeBranch.getListOfStudents().size(); i++){
            counting++;
            if (collegeBranch.getListOfStudents().get(i).getUsername().equalsIgnoreCase(studentUsername)){
                collegeBranch.getListOfStudents().remove(i);
                System.out.println("Student removed");
                break;
            }
        }

        if (counting == collegeBranch.getListOfStudents().size()){
            System.out.println("This student does not exist in this branch!!!");
        }

    }




    // Add payment to student
    public void addPayment(Student s){

        int count = 0;

        for (int i = 0; i< s.getFees().size(); i++){
            count++;
            if (s.getFees().get(i) !=0.0){
                s.getFees().set(i, 0.0);
                break;
            }

        }
        if (count == s.getFees().size()){
            System.out.println("THE FEES ARE ALL PAID. NO NEED TO ADD PAYMENT!!!");
        }

    }

}


