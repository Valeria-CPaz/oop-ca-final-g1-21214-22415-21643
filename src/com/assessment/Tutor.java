package com.assessment;

public class Tutor extends Person implements tutorTools {

    private String password;
    private String subject;


    public Tutor(String first_name, String last_name, String emailAddress, String password, String subject) {
        super(first_name, last_name, emailAddress);
        this.password = password;
        this.subject = subject;

    }




    public String getPassword() {
        return password;
    }



    public String getSubject() {
        return subject;
    }



    @Override
    public String getStudentContact(Student s) {
        return s.getEmailAddress();
    }

    @Override
    public void putGrade(Student s, double grade) {
        if (grade <= 10.0 && grade >= 0.0){
            s.getGrades().put(getSubject(), grade);}
    }
}

