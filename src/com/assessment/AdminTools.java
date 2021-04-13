package com.assessment;

public interface AdminTools {
    CollegeBranch create_branch(String unit, String address);

    Student create_students(String first_name, String last_name,String emailAddress, String password, String username);

    Tutor create_tutor(String first_name, String last_name,String emailAddress, String password, String subject);

    Courses create_branch_class(CollegeBranch collegeBranch, Tutor tutor);

    void add_student_to_class(Student student, CollegeBranch collegeBranch, Courses courses);




}
