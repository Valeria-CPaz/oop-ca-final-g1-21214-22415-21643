package com.assessment;

public class Assignment {
    private String dueDate;
    private String description;
    private String lecturerName;
    private Module module;



    public Assignment(String dueDate, String description, String lecturerName, Module module) {
        this.dueDate = dueDate;
        this.description = description;
        this.lecturerName = lecturerName;
        this.module = module;
    }
}

