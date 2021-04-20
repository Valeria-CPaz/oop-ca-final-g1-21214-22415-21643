package com.assessment;

import java.util.HashMap;
import java.util.Map;

public class Lecturer extends Person implements LecturerTools {

    private Course course;
    private String courseName;
    private Module module;
    private CollegeBranch collegeBranch;
    private String moduleName;
    private String collegeBranchName;



    public Lecturer(String first_name, String last_name, String gender, String phone, String dob, String emailAddress,
                    String idLecturer, String password, String courseName, String moduleName, String collegeBranchName) throws Exception {
        super(first_name, last_name, gender, phone, dob, emailAddress, idLecturer, password);
        this.moduleName = moduleName;
        this.collegeBranchName = collegeBranchName;
        this.courseName = courseName;

    }


    public Course getCourse() {
        return course;
    }

    public String getCourseName() {
        return courseName;
    }

    public Module getModule() {
        return module;
    }

    public CollegeBranch getCollegeBranch() {
        return collegeBranch;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getCollegeBranchName() {
        return collegeBranchName;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public void setCollegeBranch(CollegeBranch collegeBranch) {
        this.collegeBranch = collegeBranch;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setCollegeBranchName(String collegeBranchName) {
        this.collegeBranchName = collegeBranchName;
    }

    @Override
    public void setGrade(Double grade, Student s) throws Exception {

        int count = 0;

        for (Module m : s.getTimetable()) {
//            System.out.println(m.getSubject());
            if (m.equals(getModule())) {
                if (grade <= 10.0 && grade >= 0.0) {
                    s.getGrades().put(getModule().getSubject(), grade);

                }
                count++;
            }
        }

        if (count == 0) {
            throw new Exception("This student is not enrolled to your module");
        }

    }

    @Override
    public Assignment createAssignment(String dueDate, String description) {

        Assignment assignment = new Assignment(dueDate, description, (getFirstName() + " " + getLastName()), getModule());
        getModule().getListOfAssignments().add(assignment);

        for (int i = 0; i < getModule().getListOfStudentsModule().size(); i++) {
            getModule().getListOfStudentsModule().get(i).getListOfAssignments().add(assignment);
        }

        return assignment;
    }

    @Override
    public void deleteAssignment(Assignment assignment) {

        try{
            getModule().getListOfAssignments().remove(assignment);
            for (Student s : getModule().getListOfStudentsModule()){
                s.getListOfAssignments().remove(assignment);
            }
        } catch (Exception e){
            System.out.println("This assignment does not exist!");
        }

    }

    @Override
    public void editAssignment(Assignment assignment, String dueDate, String description) {



        for (int i = 0; i< getModule().getListOfAssignments().size(); i++){
            if (getModule().getListOfAssignments().get(i).equals(assignment)){

                getModule().getListOfAssignments().get(i).setDescription(description);
                getModule().getListOfAssignments().get(i).setDueDate(dueDate);
                break;
            }
        }

        for(Student s : getModule().getListOfStudentsModule()){
            for (int i = 0; i< s.getListOfAssignments().size(); i++){
                if(s.getListOfAssignments().get(i).equals(assignment)){

                    s.getListOfAssignments().get(i).setDueDate(dueDate);
                    s.getListOfAssignments().get(i).setDescription(description);

                }
            }
        }

    }

    @Override
    public String getStudentGrade(Student student) {
        HashMap<String, Double> grades = student.getGrades();
        String getGrades = "Grades " + student.getFirstName() + "\n";
        for (Map.Entry<String, Double> grade : grades.entrySet()) {

            if (grade.getKey().equalsIgnoreCase(getModule().getSubject())) {

                getGrades += grade.getValue() + "\n";

            }

        }

        return getGrades;
    }

    // CREATING and EDITING EXAMS

    @Override
    public void createExam(String date) {

        Exam e = new Exam(date, (getFirstName()+" "+getLastName()), getModule());

        getModule().getListOfExams().add(e);

        for (Student s: module.getListOfStudentsModule()){
            s.getListOfExams().add(e);
        }

    }

    @Override
    public void editExam(Exam e, String date) {

        for (int i = 0; i< getModule().getListOfAssignments().size(); i++){
            if (getModule().getListOfExams().get(i).equals(e)){

                getModule().getListOfExams().get(i).setDate(date);
                break;
            }
        }

        for(Student s : getModule().getListOfStudentsModule()){
            for (int i = 0; i< s.getListOfAssignments().size(); i++){
                if(s.getListOfExams().get(i).equals(e)){

                    s.getListOfExams().get(i).setDate(date);
                }
            }
        }



    }

}

