package com.assessment;

public interface LecturerTools {

    void setGrade(Double grade, Student student) throws Exception;
    Assignment createAssignment(String dueDate, String description);
    void deleteAssignment(Assignment assignment);
    String getStudentGrade(Student student);
}
