package com.assessment;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String phone;
    private String dob;
    private String emailAddress;
    private String username;
    private String password;

    public Person(String firstName, String lastName, String gender, String phone, String dob, String emailAddress, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
        this.dob = dob;
        this.emailAddress = emailAddress;
        this.username = username;
        this.password = password;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getDob() {
        return dob;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
