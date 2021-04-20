package com.assessment;


import java.util.HashMap;
import java.util.Map;

public class Lecturer extends Person implements LecturerTools {

    private Module module;
    private CollegeBranch collegeBranch;


    public Lecturer(String first_name, String last_name, String gender, String phone, String dob, String emailAddress,
                    String username, String password, Module module, CollegeBranch collegeBranch) throws Exception {
        super(first_name, last_name, gender, phone, dob, emailAddress, username, password);
        if (!module.getCollegeBranch().equals(collegeBranch)) {
            throw new Exception("The module and the Branch are not equal!!!!!");
        } else {
            this.module = module;
            this.collegeBranch = collegeBranch;
            module.setLecture(this);
        }
    }

    public Lecturer(String first_name, String last_name, CollegeBranch collegeBranch) {
        super(first_name, last_name);
        this.collegeBranch = collegeBranch;
    }



    public Module getModule() {
        return module;
    }

    public CollegeBranch getCollegeBranch() {
        return collegeBranch;
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

        for (int i = 0; i < getModule().getListOfStudentsModule().size(); i++){
            getModule().getListOfStudentsModule().get(i).getListOfAssignments().add(assignment);
        }

        return assignment;
    }

    @Override
    public void deleteAssignment(Assignment assignment) {

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
}
