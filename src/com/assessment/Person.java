package com.assessment;

public abstract class Person {

    private String first_name;
    private String last_name;
    private String emailAddress;

    public Person(String first_name, String second_name, String emailAddress) {
        this.first_name = first_name;
        this.last_name = second_name;
        this.emailAddress = emailAddress;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
